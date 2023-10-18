/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBLogFilesResponse extends AbstractModel {

    /**
    * Instance ID in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Total number of requested logs
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List of log files
    */
    @SerializedName("Files")
    @Expose
    private LogFileInfo [] Files;

    /**
    * For an instance in a VPC, this prefix plus URI can be used as the download address
    */
    @SerializedName("VpcPrefix")
    @Expose
    private String VpcPrefix;

    /**
    * For an instance in a common network, this prefix plus URI can be used as the download address
    */
    @SerializedName("NormalPrefix")
    @Expose
    private String NormalPrefix;

    /**
    * Shard ID in the format of shard-7noic7tv
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID in the format of dcdbt-ow728lmc. 
     * @return InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of dcdbt-ow728lmc.
     * @param InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog). 
     * @return Type Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
     * @param Type Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Total number of requested logs 
     * @return Total Total number of requested logs
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of requested logs
     * @param Total Total number of requested logs
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get List of log files 
     * @return Files List of log files
     */
    public LogFileInfo [] getFiles() {
        return this.Files;
    }

    /**
     * Set List of log files
     * @param Files List of log files
     */
    public void setFiles(LogFileInfo [] Files) {
        this.Files = Files;
    }

    /**
     * Get For an instance in a VPC, this prefix plus URI can be used as the download address 
     * @return VpcPrefix For an instance in a VPC, this prefix plus URI can be used as the download address
     */
    public String getVpcPrefix() {
        return this.VpcPrefix;
    }

    /**
     * Set For an instance in a VPC, this prefix plus URI can be used as the download address
     * @param VpcPrefix For an instance in a VPC, this prefix plus URI can be used as the download address
     */
    public void setVpcPrefix(String VpcPrefix) {
        this.VpcPrefix = VpcPrefix;
    }

    /**
     * Get For an instance in a common network, this prefix plus URI can be used as the download address 
     * @return NormalPrefix For an instance in a common network, this prefix plus URI can be used as the download address
     */
    public String getNormalPrefix() {
        return this.NormalPrefix;
    }

    /**
     * Set For an instance in a common network, this prefix plus URI can be used as the download address
     * @param NormalPrefix For an instance in a common network, this prefix plus URI can be used as the download address
     */
    public void setNormalPrefix(String NormalPrefix) {
        this.NormalPrefix = NormalPrefix;
    }

    /**
     * Get Shard ID in the format of shard-7noic7tv 
     * @return ShardId Shard ID in the format of shard-7noic7tv
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set Shard ID in the format of shard-7noic7tv
     * @param ShardId Shard ID in the format of shard-7noic7tv
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBLogFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBLogFilesResponse(DescribeDBLogFilesResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Files != null) {
            this.Files = new LogFileInfo[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new LogFileInfo(source.Files[i]);
            }
        }
        if (source.VpcPrefix != null) {
            this.VpcPrefix = new String(source.VpcPrefix);
        }
        if (source.NormalPrefix != null) {
            this.NormalPrefix = new String(source.NormalPrefix);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "VpcPrefix", this.VpcPrefix);
        this.setParamSimple(map, prefix + "NormalPrefix", this.NormalPrefix);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

