package ca.underflow.hbase;

import java.io.IOException;

import org.apache.hadoop.hbase.ipc.CoprocessorProtocol;

public interface Simple extends CoprocessorProtocol {
	
	public String poll() throws IOException;
	
}
