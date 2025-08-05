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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPGroup extends AbstractModel {

    /**
    * Group ID. Enter `0`.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IP group content, supports ip and ip range.
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * Number of ips or ranges in effect in the IP group. valid as an output parameter, no need to specify this field as an input parameter.
    */
    @SerializedName("IPTotalCount")
    @Expose
    private Long IPTotalCount;

    /**
    * Specifies the scheduled expiration information of the IP.
Specifies the IP address or IP range configuration with scheduled expiration time as an input parameter.
As an output parameter, contains the following two categories of information.
<Li>Currently not expired scheduled expiration information: expiration configuration not triggered.</li>.
<Li>Scheduled expiration information expired within a week: cache expiration configuration has been triggered.</li>.
    */
    @SerializedName("IPExpireInfo")
    @Expose
    private IPExpireInfo [] IPExpireInfo;

    /**
     * Get Group ID. Enter `0`. 
     * @return GroupId Group ID. Enter `0`.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID. Enter `0`.
     * @param GroupId Group ID. Enter `0`.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name. 
     * @return Name Group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Group name.
     * @param Name Group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IP group content, supports ip and ip range. 
     * @return Content IP group content, supports ip and ip range.
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set IP group content, supports ip and ip range.
     * @param Content IP group content, supports ip and ip range.
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get Number of ips or ranges in effect in the IP group. valid as an output parameter, no need to specify this field as an input parameter. 
     * @return IPTotalCount Number of ips or ranges in effect in the IP group. valid as an output parameter, no need to specify this field as an input parameter.
     */
    public Long getIPTotalCount() {
        return this.IPTotalCount;
    }

    /**
     * Set Number of ips or ranges in effect in the IP group. valid as an output parameter, no need to specify this field as an input parameter.
     * @param IPTotalCount Number of ips or ranges in effect in the IP group. valid as an output parameter, no need to specify this field as an input parameter.
     */
    public void setIPTotalCount(Long IPTotalCount) {
        this.IPTotalCount = IPTotalCount;
    }

    /**
     * Get Specifies the scheduled expiration information of the IP.
Specifies the IP address or IP range configuration with scheduled expiration time as an input parameter.
As an output parameter, contains the following two categories of information.
<Li>Currently not expired scheduled expiration information: expiration configuration not triggered.</li>.
<Li>Scheduled expiration information expired within a week: cache expiration configuration has been triggered.</li>. 
     * @return IPExpireInfo Specifies the scheduled expiration information of the IP.
Specifies the IP address or IP range configuration with scheduled expiration time as an input parameter.
As an output parameter, contains the following two categories of information.
<Li>Currently not expired scheduled expiration information: expiration configuration not triggered.</li>.
<Li>Scheduled expiration information expired within a week: cache expiration configuration has been triggered.</li>.
     */
    public IPExpireInfo [] getIPExpireInfo() {
        return this.IPExpireInfo;
    }

    /**
     * Set Specifies the scheduled expiration information of the IP.
Specifies the IP address or IP range configuration with scheduled expiration time as an input parameter.
As an output parameter, contains the following two categories of information.
<Li>Currently not expired scheduled expiration information: expiration configuration not triggered.</li>.
<Li>Scheduled expiration information expired within a week: cache expiration configuration has been triggered.</li>.
     * @param IPExpireInfo Specifies the scheduled expiration information of the IP.
Specifies the IP address or IP range configuration with scheduled expiration time as an input parameter.
As an output parameter, contains the following two categories of information.
<Li>Currently not expired scheduled expiration information: expiration configuration not triggered.</li>.
<Li>Scheduled expiration information expired within a week: cache expiration configuration has been triggered.</li>.
     */
    public void setIPExpireInfo(IPExpireInfo [] IPExpireInfo) {
        this.IPExpireInfo = IPExpireInfo;
    }

    public IPGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPGroup(IPGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
        if (source.IPTotalCount != null) {
            this.IPTotalCount = new Long(source.IPTotalCount);
        }
        if (source.IPExpireInfo != null) {
            this.IPExpireInfo = new IPExpireInfo[source.IPExpireInfo.length];
            for (int i = 0; i < source.IPExpireInfo.length; i++) {
                this.IPExpireInfo[i] = new IPExpireInfo(source.IPExpireInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "IPTotalCount", this.IPTotalCount);
        this.setParamArrayObj(map, prefix + "IPExpireInfo.", this.IPExpireInfo);

    }
}

