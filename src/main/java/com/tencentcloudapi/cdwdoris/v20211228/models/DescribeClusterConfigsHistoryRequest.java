/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterConfigsHistoryRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Pagination parameters. The first page is 0, and the second page is 10.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameters. The pagination step length is 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start of the time range for configuration modification history
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End of the time range for configuration modification history
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Configuration file name array to be queried. If it is empty, all historical records will be queried. Currently supported configuration file names are as follows:
apache_hdfs_broker.conf; be.conf; fe.conf; core-site.xml; hdfs-site.xml; odbcinst.ini
    */
    @SerializedName("ConfigFileNames")
    @Expose
    private String [] ConfigFileNames;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Pagination parameters. The first page is 0, and the second page is 10. 
     * @return Offset Pagination parameters. The first page is 0, and the second page is 10.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters. The first page is 0, and the second page is 10.
     * @param Offset Pagination parameters. The first page is 0, and the second page is 10.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameters. The pagination step length is 10 by default. 
     * @return Limit Pagination parameters. The pagination step length is 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters. The pagination step length is 10 by default.
     * @param Limit Pagination parameters. The pagination step length is 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start of the time range for configuration modification history 
     * @return StartTime Start of the time range for configuration modification history
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start of the time range for configuration modification history
     * @param StartTime Start of the time range for configuration modification history
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End of the time range for configuration modification history 
     * @return EndTime End of the time range for configuration modification history
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End of the time range for configuration modification history
     * @param EndTime End of the time range for configuration modification history
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Configuration file name array to be queried. If it is empty, all historical records will be queried. Currently supported configuration file names are as follows:
apache_hdfs_broker.conf; be.conf; fe.conf; core-site.xml; hdfs-site.xml; odbcinst.ini 
     * @return ConfigFileNames Configuration file name array to be queried. If it is empty, all historical records will be queried. Currently supported configuration file names are as follows:
apache_hdfs_broker.conf; be.conf; fe.conf; core-site.xml; hdfs-site.xml; odbcinst.ini
     */
    public String [] getConfigFileNames() {
        return this.ConfigFileNames;
    }

    /**
     * Set Configuration file name array to be queried. If it is empty, all historical records will be queried. Currently supported configuration file names are as follows:
apache_hdfs_broker.conf; be.conf; fe.conf; core-site.xml; hdfs-site.xml; odbcinst.ini
     * @param ConfigFileNames Configuration file name array to be queried. If it is empty, all historical records will be queried. Currently supported configuration file names are as follows:
apache_hdfs_broker.conf; be.conf; fe.conf; core-site.xml; hdfs-site.xml; odbcinst.ini
     */
    public void setConfigFileNames(String [] ConfigFileNames) {
        this.ConfigFileNames = ConfigFileNames;
    }

    public DescribeClusterConfigsHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterConfigsHistoryRequest(DescribeClusterConfigsHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ConfigFileNames != null) {
            this.ConfigFileNames = new String[source.ConfigFileNames.length];
            for (int i = 0; i < source.ConfigFileNames.length; i++) {
                this.ConfigFileNames[i] = new String(source.ConfigFileNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "ConfigFileNames.", this.ConfigFileNames);

    }
}

