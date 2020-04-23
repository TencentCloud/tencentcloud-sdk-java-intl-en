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

public class CopyAccountPrivilegesRequest extends AbstractModel{

    /**
    * Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Source username
    */
    @SerializedName("SrcUserName")
    @Expose
    private String SrcUserName;

    /**
    * Access host allowed for source user
    */
    @SerializedName("SrcHost")
    @Expose
    private String SrcHost;

    /**
    * Target username
    */
    @SerializedName("DstUserName")
    @Expose
    private String DstUserName;

    /**
    * Access host allowed for target user
    */
    @SerializedName("DstHost")
    @Expose
    private String DstHost;

    /**
    * `ReadOnly` attribute of source account
    */
    @SerializedName("SrcReadOnly")
    @Expose
    private String SrcReadOnly;

    /**
    * `ReadOnly` attribute of target account
    */
    @SerializedName("DstReadOnly")
    @Expose
    private String DstReadOnly;

    /**
     * Get Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API. 
     * @return InstanceId Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     * @param InstanceId Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Source username 
     * @return SrcUserName Source username
     */
    public String getSrcUserName() {
        return this.SrcUserName;
    }

    /**
     * Set Source username
     * @param SrcUserName Source username
     */
    public void setSrcUserName(String SrcUserName) {
        this.SrcUserName = SrcUserName;
    }

    /**
     * Get Access host allowed for source user 
     * @return SrcHost Access host allowed for source user
     */
    public String getSrcHost() {
        return this.SrcHost;
    }

    /**
     * Set Access host allowed for source user
     * @param SrcHost Access host allowed for source user
     */
    public void setSrcHost(String SrcHost) {
        this.SrcHost = SrcHost;
    }

    /**
     * Get Target username 
     * @return DstUserName Target username
     */
    public String getDstUserName() {
        return this.DstUserName;
    }

    /**
     * Set Target username
     * @param DstUserName Target username
     */
    public void setDstUserName(String DstUserName) {
        this.DstUserName = DstUserName;
    }

    /**
     * Get Access host allowed for target user 
     * @return DstHost Access host allowed for target user
     */
    public String getDstHost() {
        return this.DstHost;
    }

    /**
     * Set Access host allowed for target user
     * @param DstHost Access host allowed for target user
     */
    public void setDstHost(String DstHost) {
        this.DstHost = DstHost;
    }

    /**
     * Get `ReadOnly` attribute of source account 
     * @return SrcReadOnly `ReadOnly` attribute of source account
     */
    public String getSrcReadOnly() {
        return this.SrcReadOnly;
    }

    /**
     * Set `ReadOnly` attribute of source account
     * @param SrcReadOnly `ReadOnly` attribute of source account
     */
    public void setSrcReadOnly(String SrcReadOnly) {
        this.SrcReadOnly = SrcReadOnly;
    }

    /**
     * Get `ReadOnly` attribute of target account 
     * @return DstReadOnly `ReadOnly` attribute of target account
     */
    public String getDstReadOnly() {
        return this.DstReadOnly;
    }

    /**
     * Set `ReadOnly` attribute of target account
     * @param DstReadOnly `ReadOnly` attribute of target account
     */
    public void setDstReadOnly(String DstReadOnly) {
        this.DstReadOnly = DstReadOnly;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcUserName", this.SrcUserName);
        this.setParamSimple(map, prefix + "SrcHost", this.SrcHost);
        this.setParamSimple(map, prefix + "DstUserName", this.DstUserName);
        this.setParamSimple(map, prefix + "DstHost", this.DstHost);
        this.setParamSimple(map, prefix + "SrcReadOnly", this.SrcReadOnly);
        this.setParamSimple(map, prefix + "DstReadOnly", this.DstReadOnly);

    }
}

