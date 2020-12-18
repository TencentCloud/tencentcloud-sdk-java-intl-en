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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigurationItems extends AbstractModel{

    /**
    * Time of getting a configuration item
    */
    @SerializedName("ConfigurationItemCaptureTime")
    @Expose
    private String ConfigurationItemCaptureTime;

    /**
    * Resource relationship list
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Relationships")
    @Expose
    private String Relationships;

    /**
    * This parameter takes effect only when `DiffMode` is set to `true`. When the input parameter `ChronologicalOrder` of the `GetConfigurationItems` API is set to `Forward`, details of the configuration item before the first one (if not a creation configuration item) will be returned. When this parameter is set to `Reverse`, details of the configuration item after the last one (if not a resource deletion configuration item) will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastItemInfo")
    @Expose
    private String LastItemInfo;

    /**
    * List of events associated with the configuration changes
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RelatedEvents")
    @Expose
    private RelatedEvent [] RelatedEvents;

    /**
    * Resource type
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Configuration item ID
    */
    @SerializedName("ConfigurationStateId")
    @Expose
    private String ConfigurationStateId;

    /**
    * Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceCreateTime")
    @Expose
    private String ResourceCreateTime;

    /**
    * CFA version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
    * Resource name
    */
    @SerializedName("ResourceAlias")
    @Expose
    private String ResourceAlias;

    /**
    * Configuration item status. Valid values: OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded.
    */
    @SerializedName("ConfigurationItemStatus")
    @Expose
    private String ConfigurationItemStatus;

    /**
     * Get Time of getting a configuration item 
     * @return ConfigurationItemCaptureTime Time of getting a configuration item
     */
    public String getConfigurationItemCaptureTime() {
        return this.ConfigurationItemCaptureTime;
    }

    /**
     * Set Time of getting a configuration item
     * @param ConfigurationItemCaptureTime Time of getting a configuration item
     */
    public void setConfigurationItemCaptureTime(String ConfigurationItemCaptureTime) {
        this.ConfigurationItemCaptureTime = ConfigurationItemCaptureTime;
    }

    /**
     * Get Resource relationship list
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Relationships Resource relationship list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRelationships() {
        return this.Relationships;
    }

    /**
     * Set Resource relationship list
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Relationships Resource relationship list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRelationships(String Relationships) {
        this.Relationships = Relationships;
    }

    /**
     * Get This parameter takes effect only when `DiffMode` is set to `true`. When the input parameter `ChronologicalOrder` of the `GetConfigurationItems` API is set to `Forward`, details of the configuration item before the first one (if not a creation configuration item) will be returned. When this parameter is set to `Reverse`, details of the configuration item after the last one (if not a resource deletion configuration item) will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LastItemInfo This parameter takes effect only when `DiffMode` is set to `true`. When the input parameter `ChronologicalOrder` of the `GetConfigurationItems` API is set to `Forward`, details of the configuration item before the first one (if not a creation configuration item) will be returned. When this parameter is set to `Reverse`, details of the configuration item after the last one (if not a resource deletion configuration item) will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastItemInfo() {
        return this.LastItemInfo;
    }

    /**
     * Set This parameter takes effect only when `DiffMode` is set to `true`. When the input parameter `ChronologicalOrder` of the `GetConfigurationItems` API is set to `Forward`, details of the configuration item before the first one (if not a creation configuration item) will be returned. When this parameter is set to `Reverse`, details of the configuration item after the last one (if not a resource deletion configuration item) will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LastItemInfo This parameter takes effect only when `DiffMode` is set to `true`. When the input parameter `ChronologicalOrder` of the `GetConfigurationItems` API is set to `Forward`, details of the configuration item before the first one (if not a creation configuration item) will be returned. When this parameter is set to `Reverse`, details of the configuration item after the last one (if not a resource deletion configuration item) will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastItemInfo(String LastItemInfo) {
        this.LastItemInfo = LastItemInfo;
    }

    /**
     * Get List of events associated with the configuration changes
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RelatedEvents List of events associated with the configuration changes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RelatedEvent [] getRelatedEvents() {
        return this.RelatedEvents;
    }

    /**
     * Set List of events associated with the configuration changes
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RelatedEvents List of events associated with the configuration changes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRelatedEvents(RelatedEvent [] RelatedEvents) {
        this.RelatedEvents = RelatedEvents;
    }

    /**
     * Get Resource type 
     * @return ResourceType Resource type
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
     * @param ResourceType Resource type
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Configuration item ID 
     * @return ConfigurationStateId Configuration item ID
     */
    public String getConfigurationStateId() {
        return this.ConfigurationStateId;
    }

    /**
     * Set Configuration item ID
     * @param ConfigurationStateId Configuration item ID
     */
    public void setConfigurationStateId(String ConfigurationStateId) {
        this.ConfigurationStateId = ConfigurationStateId;
    }

    /**
     * Get Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceCreateTime Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceCreateTime() {
        return this.ResourceCreateTime;
    }

    /**
     * Set Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceCreateTime Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceCreateTime(String ResourceCreateTime) {
        this.ResourceCreateTime = ResourceCreateTime;
    }

    /**
     * Get CFA version 
     * @return Version CFA version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set CFA version
     * @param Version CFA version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Resource region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceRegion Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceRegion Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get  
     * @return Configuration 
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set 
     * @param Configuration 
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get Resource name 
     * @return ResourceAlias Resource name
     */
    public String getResourceAlias() {
        return this.ResourceAlias;
    }

    /**
     * Set Resource name
     * @param ResourceAlias Resource name
     */
    public void setResourceAlias(String ResourceAlias) {
        this.ResourceAlias = ResourceAlias;
    }

    /**
     * Get Configuration item status. Valid values: OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded. 
     * @return ConfigurationItemStatus Configuration item status. Valid values: OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded.
     */
    public String getConfigurationItemStatus() {
        return this.ConfigurationItemStatus;
    }

    /**
     * Set Configuration item status. Valid values: OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded.
     * @param ConfigurationItemStatus Configuration item status. Valid values: OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded.
     */
    public void setConfigurationItemStatus(String ConfigurationItemStatus) {
        this.ConfigurationItemStatus = ConfigurationItemStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigurationItemCaptureTime", this.ConfigurationItemCaptureTime);
        this.setParamSimple(map, prefix + "Relationships", this.Relationships);
        this.setParamSimple(map, prefix + "LastItemInfo", this.LastItemInfo);
        this.setParamArrayObj(map, prefix + "RelatedEvents.", this.RelatedEvents);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ConfigurationStateId", this.ConfigurationStateId);
        this.setParamSimple(map, prefix + "ResourceCreateTime", this.ResourceCreateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);
        this.setParamSimple(map, prefix + "ResourceAlias", this.ResourceAlias);
        this.setParamSimple(map, prefix + "ConfigurationItemStatus", this.ConfigurationItemStatus);

    }
}

