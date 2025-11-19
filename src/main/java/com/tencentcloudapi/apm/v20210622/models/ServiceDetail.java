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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDetail extends AbstractModel {

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * Business system ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * User appid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Host account UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUIN")
    @Expose
    private String CreateUIN;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Application description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * Region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Business system name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get Business system ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceKey Business system ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Business system ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceKey Business system ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get User appid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppID User appid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set User appid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppID User appid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Host account UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUIN Host account UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUIN() {
        return this.CreateUIN;
    }

    /**
     * Set Host account UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUIN Host account UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUIN(String CreateUIN) {
        this.CreateUIN = CreateUIN;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Application description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDescription Application description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set Application description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceDescription Application description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get Region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Business system name. 
     * @return InstanceName Business system name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Business system name.
     * @param InstanceName Business system name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ServiceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDetail(ServiceDetail source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CreateUIN != null) {
            this.CreateUIN = new String(source.CreateUIN);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CreateUIN", this.CreateUIN);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

