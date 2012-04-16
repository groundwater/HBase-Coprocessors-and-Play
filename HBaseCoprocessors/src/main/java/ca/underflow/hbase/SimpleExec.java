package ca.underflow.hbase;

import java.io.IOException;
import org.apache.hadoop.hbase.coprocessor.BaseEndpointCoprocessor;
import org.apache.hadoop.hbase.coprocessor.RegionCoprocessorEnvironment;
import org.apache.hadoop.hbase.regionserver.HRegion;

public class SimpleExec extends BaseEndpointCoprocessor implements Simple {

	public String poll() throws IOException {
		
		HRegion region = ((RegionCoprocessorEnvironment) getEnvironment()).getRegion();
		
		return region.getRegionNameAsString();
		
	}

}