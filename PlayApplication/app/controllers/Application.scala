package controllers

import org.apache.hadoop.hbase.client.HTable
import org.apache.hadoop.hbase.client.HTableInterface
import org.apache.hadoop.hbase.util.Bytes
import org.apache.hadoop.hbase.HBaseConfiguration

import ca.underflow.hbase.Simple
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

    val conf = HBaseConfiguration.create()
    val table: HTableInterface = new HTable(conf, "demo")

    def index = Action {
        
        val region = Bytes.toBytes("row1")
        val proxy = table.coprocessorProxy(classOf[Simple],region)
        
        Ok( proxy.poll() )

    }

}