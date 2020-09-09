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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBLogFilesResponse extends AbstractModel{

    /**
    * Instance ID in the format of `tdsql-ow728lmc`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Requested log type. Valid values: 1 (binlog), 2 (cold backup), 3 (errlog), 4 (slowlog).
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
    * Information such as `uri`, `length`, and `mtime` (modification time)
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
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID in the format of `tdsql-ow728lmc`. 
     * @return InstanceId Instance ID in the format of `tdsql-ow728lmc`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `tdsql-ow728lmc`.
     * @param InstanceId Instance ID in the format of `tdsql-ow728lmc`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Requested log type. Valid values: 1 (binlog), 2 (cold backup), 3 (errlog), 4 (slowlog). 
     * @return Type Requested log type. Valid values: 1 (binlog), 2 (cold backup), 3 (errlog), 4 (slowlog).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Requested log type. Valid values: 1 (binlog), 2 (cold backup), 3 (errlog), 4 (slowlog).
     * @param Type Requested log type. Valid values: 1 (binlog), 2 (cold backup), 3 (errlog), 4 (slowlog).
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
     * Get Information such as `uri`, `length`, and `mtime` (modification time) 
     * @return Files Information such as `uri`, `length`, and `mtime` (modification time)
     */
    public LogFileInfo [] getFiles() {
        return this.Files;
    }

    /**
     * Set Information such as `uri`, `length`, and `mtime` (modification time)
     * @param Files Information such as `uri`, `length`, and `mtime` (modification time)
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
