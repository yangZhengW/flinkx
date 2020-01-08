/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.dtstack.flinkx.oraclelogminer.format;

import java.io.Serializable;
import java.util.List;

/**
 * @author jiangbo
 * @date 2019/12/14
 */
public class LogMinerConfig implements Serializable {

    private String driverName = "oracle.jdbc.driver.OracleDriver";

    private String jdbcUrl;

    private String username;

    private String password;

    private int fetchSize = 1;

    private String listenerTables;

    private String listenerOperations = "UPDATE,INSERT,DELETE";

    /**
     * 读取位置: all, current, time, scn
     */
    private String readPosition = "current";

    /**
     * 毫秒级时间戳
     */
    private long startTime = 0;

    private String startSCN = "";

    private boolean pavingData = false;

    private List<String> table;

    private Long queryTimeout;

    public Long getQueryTimeout() {
        return queryTimeout;
    }

    public void setQueryTimeout(Long queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    public List<String> getTable() {
        return table;
    }

    public void setTable(List<String> table) {
        this.table = table;
    }

    public String getReadPosition() {
        return readPosition;
    }

    public void setReadPosition(String readPosition) {
        this.readPosition = readPosition;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getStartSCN() {
        return startSCN;
    }

    public void setStartSCN(String startSCN) {
        this.startSCN = startSCN;
    }

    public boolean getPavingData() {
        return pavingData;
    }

    public void setPavingData(boolean pavingData) {
        this.pavingData = pavingData;
    }

    public String getListenerOperations() {
        return listenerOperations;
    }

    public void setListenerOperations(String listenerOperations) {
        this.listenerOperations = listenerOperations;
    }

    public String getListenerTables() {
        return listenerTables;
    }

    public void setListenerTables(String listenerTables) {
        this.listenerTables = listenerTables;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
