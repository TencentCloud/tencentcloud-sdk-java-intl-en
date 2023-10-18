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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostsAttributeRequest extends AbstractModel {

    /**
    * CDH instance ID(s).
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * CDH instance name to be displayed. You can specify any name you like, but its length cannot exceed 60 characters.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Auto renewal flag. Valid values: <br><li>NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically <br><li>NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither notify upon expiration nor renew automatically <br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis if the account balance is sufficient.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Project ID. You can use the `AddProject` API to create projects, and obtain the `projectId` field in the response of the `DescribeProject` API. When using the [DescribeHosts](https://intl.cloud.tencent.com/document/api/213/16474?from_cn_redirect=1) API to query instances later, you can filter the results by the project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get CDH instance ID(s). 
     * @return HostIds CDH instance ID(s).
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set CDH instance ID(s).
     * @param HostIds CDH instance ID(s).
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get CDH instance name to be displayed. You can specify any name you like, but its length cannot exceed 60 characters. 
     * @return HostName CDH instance name to be displayed. You can specify any name you like, but its length cannot exceed 60 characters.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set CDH instance name to be displayed. You can specify any name you like, but its length cannot exceed 60 characters.
     * @param HostName CDH instance name to be displayed. You can specify any name you like, but its length cannot exceed 60 characters.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Auto renewal flag. Valid values: <br><li>NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically <br><li>NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither notify upon expiration nor renew automatically <br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis if the account balance is sufficient. 
     * @return RenewFlag Auto renewal flag. Valid values: <br><li>NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically <br><li>NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither notify upon expiration nor renew automatically <br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis if the account balance is sufficient.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto renewal flag. Valid values: <br><li>NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically <br><li>NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither notify upon expiration nor renew automatically <br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis if the account balance is sufficient.
     * @param RenewFlag Auto renewal flag. Valid values: <br><li>NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically <br><li>NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither notify upon expiration nor renew automatically <br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis if the account balance is sufficient.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Project ID. You can use the `AddProject` API to create projects, and obtain the `projectId` field in the response of the `DescribeProject` API. When using the [DescribeHosts](https://intl.cloud.tencent.com/document/api/213/16474?from_cn_redirect=1) API to query instances later, you can filter the results by the project ID. 
     * @return ProjectId Project ID. You can use the `AddProject` API to create projects, and obtain the `projectId` field in the response of the `DescribeProject` API. When using the [DescribeHosts](https://intl.cloud.tencent.com/document/api/213/16474?from_cn_redirect=1) API to query instances later, you can filter the results by the project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. You can use the `AddProject` API to create projects, and obtain the `projectId` field in the response of the `DescribeProject` API. When using the [DescribeHosts](https://intl.cloud.tencent.com/document/api/213/16474?from_cn_redirect=1) API to query instances later, you can filter the results by the project ID.
     * @param ProjectId Project ID. You can use the `AddProject` API to create projects, and obtain the `projectId` field in the response of the `DescribeProject` API. When using the [DescribeHosts](https://intl.cloud.tencent.com/document/api/213/16474?from_cn_redirect=1) API to query instances later, you can filter the results by the project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyHostsAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostsAttributeRequest(ModifyHostsAttributeRequest source) {
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

