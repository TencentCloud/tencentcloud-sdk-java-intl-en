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
    * <p>IP group Id. Enter 0 when created.</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>IP group name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>IP group content supports only IP and IP range.</p>
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * <p>Number of IPs or IP ranges that are effective in the IP group. Valid as an output parameter. Not required as an input parameter.</p>
    */
    @SerializedName("IPTotalCount")
    @Expose
    private Long IPTotalCount;

    /**
    * <p>Scheduled expiration information for IP.<br>As an input parameter, it is used to specify a scheduled expiration time for a given IP address or IP range.<br>As an output parameter, it contains the following two categories of information:</p><li>Current scheduled expiration information that has not expired: expiration configuration not triggered.</li><li>Scheduled expiration information that has expired within a week: expiration configuration that has been triggered.</li>
    */
    @SerializedName("IPExpireInfo")
    @Expose
    private IPExpireInfo [] IPExpireInfo;

    /**
    * <p>The number of IP groups referenced.</p>
    */
    @SerializedName("RefCount")
    @Expose
    private Long RefCount;

    /**
     * Get <p>IP group Id. Enter 0 when created.</p> 
     * @return GroupId <p>IP group Id. Enter 0 when created.</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>IP group Id. Enter 0 when created.</p>
     * @param GroupId <p>IP group Id. Enter 0 when created.</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>IP group name.</p> 
     * @return Name <p>IP group name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>IP group name.</p>
     * @param Name <p>IP group name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>IP group content supports only IP and IP range.</p> 
     * @return Content <p>IP group content supports only IP and IP range.</p>
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set <p>IP group content supports only IP and IP range.</p>
     * @param Content <p>IP group content supports only IP and IP range.</p>
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Number of IPs or IP ranges that are effective in the IP group. Valid as an output parameter. Not required as an input parameter.</p> 
     * @return IPTotalCount <p>Number of IPs or IP ranges that are effective in the IP group. Valid as an output parameter. Not required as an input parameter.</p>
     */
    public Long getIPTotalCount() {
        return this.IPTotalCount;
    }

    /**
     * Set <p>Number of IPs or IP ranges that are effective in the IP group. Valid as an output parameter. Not required as an input parameter.</p>
     * @param IPTotalCount <p>Number of IPs or IP ranges that are effective in the IP group. Valid as an output parameter. Not required as an input parameter.</p>
     */
    public void setIPTotalCount(Long IPTotalCount) {
        this.IPTotalCount = IPTotalCount;
    }

    /**
     * Get <p>Scheduled expiration information for IP.<br>As an input parameter, it is used to specify a scheduled expiration time for a given IP address or IP range.<br>As an output parameter, it contains the following two categories of information:</p><li>Current scheduled expiration information that has not expired: expiration configuration not triggered.</li><li>Scheduled expiration information that has expired within a week: expiration configuration that has been triggered.</li> 
     * @return IPExpireInfo <p>Scheduled expiration information for IP.<br>As an input parameter, it is used to specify a scheduled expiration time for a given IP address or IP range.<br>As an output parameter, it contains the following two categories of information:</p><li>Current scheduled expiration information that has not expired: expiration configuration not triggered.</li><li>Scheduled expiration information that has expired within a week: expiration configuration that has been triggered.</li>
     */
    public IPExpireInfo [] getIPExpireInfo() {
        return this.IPExpireInfo;
    }

    /**
     * Set <p>Scheduled expiration information for IP.<br>As an input parameter, it is used to specify a scheduled expiration time for a given IP address or IP range.<br>As an output parameter, it contains the following two categories of information:</p><li>Current scheduled expiration information that has not expired: expiration configuration not triggered.</li><li>Scheduled expiration information that has expired within a week: expiration configuration that has been triggered.</li>
     * @param IPExpireInfo <p>Scheduled expiration information for IP.<br>As an input parameter, it is used to specify a scheduled expiration time for a given IP address or IP range.<br>As an output parameter, it contains the following two categories of information:</p><li>Current scheduled expiration information that has not expired: expiration configuration not triggered.</li><li>Scheduled expiration information that has expired within a week: expiration configuration that has been triggered.</li>
     */
    public void setIPExpireInfo(IPExpireInfo [] IPExpireInfo) {
        this.IPExpireInfo = IPExpireInfo;
    }

    /**
     * Get <p>The number of IP groups referenced.</p> 
     * @return RefCount <p>The number of IP groups referenced.</p>
     */
    public Long getRefCount() {
        return this.RefCount;
    }

    /**
     * Set <p>The number of IP groups referenced.</p>
     * @param RefCount <p>The number of IP groups referenced.</p>
     */
    public void setRefCount(Long RefCount) {
        this.RefCount = RefCount;
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
        if (source.RefCount != null) {
            this.RefCount = new Long(source.RefCount);
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
        this.setParamSimple(map, prefix + "RefCount", this.RefCount);

    }
}

