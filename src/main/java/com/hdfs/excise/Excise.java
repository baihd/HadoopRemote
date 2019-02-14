package com.hdfs.excise;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

public class Excise {

    public static void main(String[] args) throws Exception {
        String uri = "hdfs://localhost:9000/";
        Configuration conf = new Configuration();

        FileSystem fs = FileSystem.get(URI.create(uri), conf);

        //列出hdfs上 /input 目录下的所有文件
        FileStatus[] statuses = fs.listStatus(new Path("/input"));
        for (FileStatus status : statuses) {
            System.out.println(status);
        }
    }
}
