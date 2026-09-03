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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClearLaunchConfigurationAttributesRequest extends AbstractModel {

    /**
    * <p>Launch configuration ID. Obtain it in the following ways:</p><li>Log in to the [console](https://console.cloud.tencent.com/autoscaling/config) and query the launch configuration ID.</li><li>Call the API [DescribeLaunchConfigurations](https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1) and obtain the launch configuration ID from the `LaunchConfigurationId` in the returned information.</li>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <p>Whether to clear data disk information. This parameter is optional and defaults to false.<br>Enter true to clear "data disk" information. After clearing, newly created CVMs will not contain any data disk.</p>
    */
    @SerializedName("ClearDataDisks")
    @Expose
    private Boolean ClearDataDisks;

    /**
    * <p>Whether to clear the MachineName-related settings of the CVM. Optional. It is false by default.<br>Set to true to clear the host name settings. After clearing, newly created CVMs will not have a host name configured.</p>
    */
    @SerializedName("ClearHostNameSettings")
    @Expose
    private Boolean ClearHostNameSettings;

    /**
    * <p>Whether to clear the CVM instance name related settings. This parameter is optional and is false by default.<br>If set to true, the host name setting information is cleared. After clearing, newly created CVMs will be configured based on "as-{{ scaling group AutoScalingGroupName }}".</p>
    */
    @SerializedName("ClearInstanceNameSettings")
    @Expose
    private Boolean ClearInstanceNameSettings;

    /**
    * <p>Whether to clear the placement group information. This parameter is optional and defaults to false.<br>Set it to true to clear the placement group information. After clearing, newly created hosts will not be assigned to any placement group.</p>
    */
    @SerializedName("ClearDisasterRecoverGroupIds")
    @Expose
    private Boolean ClearDisasterRecoverGroupIds;

    /**
    * <p>Whether to clear the instance tag list. This parameter is optional and is false by default.<br>If true is filled in, it indicates that the instance tag list should be cleared. After the list is cleared, the CVMs created based on this will not be bound to the tags in the list.</p>
    */
    @SerializedName("ClearInstanceTags")
    @Expose
    private Boolean ClearInstanceTags;

    /**
    * <p>Whether to clear MetaData. This parameter is optional and defaults to false. Enter true to clear MetaData. After clearing, newly created CVMs will not associate custom Metadata.</p>
    */
    @SerializedName("ClearMetadata")
    @Expose
    private Boolean ClearMetadata;

    /**
    * <p>Whether to clear the NetworkInterfaces in the launch configuration. If the value is TRUE, clear it; if not passed or FALSE, this field will not be processed.</p>
    */
    @SerializedName("ClearNetworkInterfaces")
    @Expose
    private Boolean ClearNetworkInterfaces;

    /**
     * Get <p>Launch configuration ID. Obtain it in the following ways:</p><li>Log in to the [console](https://console.cloud.tencent.com/autoscaling/config) and query the launch configuration ID.</li><li>Call the API [DescribeLaunchConfigurations](https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1) and obtain the launch configuration ID from the `LaunchConfigurationId` in the returned information.</li> 
     * @return LaunchConfigurationId <p>Launch configuration ID. Obtain it in the following ways:</p><li>Log in to the [console](https://console.cloud.tencent.com/autoscaling/config) and query the launch configuration ID.</li><li>Call the API [DescribeLaunchConfigurations](https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1) and obtain the launch configuration ID from the `LaunchConfigurationId` in the returned information.</li>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>Launch configuration ID. Obtain it in the following ways:</p><li>Log in to the [console](https://console.cloud.tencent.com/autoscaling/config) and query the launch configuration ID.</li><li>Call the API [DescribeLaunchConfigurations](https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1) and obtain the launch configuration ID from the `LaunchConfigurationId` in the returned information.</li>
     * @param LaunchConfigurationId <p>Launch configuration ID. Obtain it in the following ways:</p><li>Log in to the [console](https://console.cloud.tencent.com/autoscaling/config) and query the launch configuration ID.</li><li>Call the API [DescribeLaunchConfigurations](https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1) and obtain the launch configuration ID from the `LaunchConfigurationId` in the returned information.</li>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <p>Whether to clear data disk information. This parameter is optional and defaults to false.<br>Enter true to clear "data disk" information. After clearing, newly created CVMs will not contain any data disk.</p> 
     * @return ClearDataDisks <p>Whether to clear data disk information. This parameter is optional and defaults to false.<br>Enter true to clear "data disk" information. After clearing, newly created CVMs will not contain any data disk.</p>
     */
    public Boolean getClearDataDisks() {
        return this.ClearDataDisks;
    }

    /**
     * Set <p>Whether to clear data disk information. This parameter is optional and defaults to false.<br>Enter true to clear "data disk" information. After clearing, newly created CVMs will not contain any data disk.</p>
     * @param ClearDataDisks <p>Whether to clear data disk information. This parameter is optional and defaults to false.<br>Enter true to clear "data disk" information. After clearing, newly created CVMs will not contain any data disk.</p>
     */
    public void setClearDataDisks(Boolean ClearDataDisks) {
        this.ClearDataDisks = ClearDataDisks;
    }

    /**
     * Get <p>Whether to clear the MachineName-related settings of the CVM. Optional. It is false by default.<br>Set to true to clear the host name settings. After clearing, newly created CVMs will not have a host name configured.</p> 
     * @return ClearHostNameSettings <p>Whether to clear the MachineName-related settings of the CVM. Optional. It is false by default.<br>Set to true to clear the host name settings. After clearing, newly created CVMs will not have a host name configured.</p>
     */
    public Boolean getClearHostNameSettings() {
        return this.ClearHostNameSettings;
    }

    /**
     * Set <p>Whether to clear the MachineName-related settings of the CVM. Optional. It is false by default.<br>Set to true to clear the host name settings. After clearing, newly created CVMs will not have a host name configured.</p>
     * @param ClearHostNameSettings <p>Whether to clear the MachineName-related settings of the CVM. Optional. It is false by default.<br>Set to true to clear the host name settings. After clearing, newly created CVMs will not have a host name configured.</p>
     */
    public void setClearHostNameSettings(Boolean ClearHostNameSettings) {
        this.ClearHostNameSettings = ClearHostNameSettings;
    }

    /**
     * Get <p>Whether to clear the CVM instance name related settings. This parameter is optional and is false by default.<br>If set to true, the host name setting information is cleared. After clearing, newly created CVMs will be configured based on "as-{{ scaling group AutoScalingGroupName }}".</p> 
     * @return ClearInstanceNameSettings <p>Whether to clear the CVM instance name related settings. This parameter is optional and is false by default.<br>If set to true, the host name setting information is cleared. After clearing, newly created CVMs will be configured based on "as-{{ scaling group AutoScalingGroupName }}".</p>
     */
    public Boolean getClearInstanceNameSettings() {
        return this.ClearInstanceNameSettings;
    }

    /**
     * Set <p>Whether to clear the CVM instance name related settings. This parameter is optional and is false by default.<br>If set to true, the host name setting information is cleared. After clearing, newly created CVMs will be configured based on "as-{{ scaling group AutoScalingGroupName }}".</p>
     * @param ClearInstanceNameSettings <p>Whether to clear the CVM instance name related settings. This parameter is optional and is false by default.<br>If set to true, the host name setting information is cleared. After clearing, newly created CVMs will be configured based on "as-{{ scaling group AutoScalingGroupName }}".</p>
     */
    public void setClearInstanceNameSettings(Boolean ClearInstanceNameSettings) {
        this.ClearInstanceNameSettings = ClearInstanceNameSettings;
    }

    /**
     * Get <p>Whether to clear the placement group information. This parameter is optional and defaults to false.<br>Set it to true to clear the placement group information. After clearing, newly created hosts will not be assigned to any placement group.</p> 
     * @return ClearDisasterRecoverGroupIds <p>Whether to clear the placement group information. This parameter is optional and defaults to false.<br>Set it to true to clear the placement group information. After clearing, newly created hosts will not be assigned to any placement group.</p>
     */
    public Boolean getClearDisasterRecoverGroupIds() {
        return this.ClearDisasterRecoverGroupIds;
    }

    /**
     * Set <p>Whether to clear the placement group information. This parameter is optional and defaults to false.<br>Set it to true to clear the placement group information. After clearing, newly created hosts will not be assigned to any placement group.</p>
     * @param ClearDisasterRecoverGroupIds <p>Whether to clear the placement group information. This parameter is optional and defaults to false.<br>Set it to true to clear the placement group information. After clearing, newly created hosts will not be assigned to any placement group.</p>
     */
    public void setClearDisasterRecoverGroupIds(Boolean ClearDisasterRecoverGroupIds) {
        this.ClearDisasterRecoverGroupIds = ClearDisasterRecoverGroupIds;
    }

    /**
     * Get <p>Whether to clear the instance tag list. This parameter is optional and is false by default.<br>If true is filled in, it indicates that the instance tag list should be cleared. After the list is cleared, the CVMs created based on this will not be bound to the tags in the list.</p> 
     * @return ClearInstanceTags <p>Whether to clear the instance tag list. This parameter is optional and is false by default.<br>If true is filled in, it indicates that the instance tag list should be cleared. After the list is cleared, the CVMs created based on this will not be bound to the tags in the list.</p>
     */
    public Boolean getClearInstanceTags() {
        return this.ClearInstanceTags;
    }

    /**
     * Set <p>Whether to clear the instance tag list. This parameter is optional and is false by default.<br>If true is filled in, it indicates that the instance tag list should be cleared. After the list is cleared, the CVMs created based on this will not be bound to the tags in the list.</p>
     * @param ClearInstanceTags <p>Whether to clear the instance tag list. This parameter is optional and is false by default.<br>If true is filled in, it indicates that the instance tag list should be cleared. After the list is cleared, the CVMs created based on this will not be bound to the tags in the list.</p>
     */
    public void setClearInstanceTags(Boolean ClearInstanceTags) {
        this.ClearInstanceTags = ClearInstanceTags;
    }

    /**
     * Get <p>Whether to clear MetaData. This parameter is optional and defaults to false. Enter true to clear MetaData. After clearing, newly created CVMs will not associate custom Metadata.</p> 
     * @return ClearMetadata <p>Whether to clear MetaData. This parameter is optional and defaults to false. Enter true to clear MetaData. After clearing, newly created CVMs will not associate custom Metadata.</p>
     */
    public Boolean getClearMetadata() {
        return this.ClearMetadata;
    }

    /**
     * Set <p>Whether to clear MetaData. This parameter is optional and defaults to false. Enter true to clear MetaData. After clearing, newly created CVMs will not associate custom Metadata.</p>
     * @param ClearMetadata <p>Whether to clear MetaData. This parameter is optional and defaults to false. Enter true to clear MetaData. After clearing, newly created CVMs will not associate custom Metadata.</p>
     */
    public void setClearMetadata(Boolean ClearMetadata) {
        this.ClearMetadata = ClearMetadata;
    }

    /**
     * Get <p>Whether to clear the NetworkInterfaces in the launch configuration. If the value is TRUE, clear it; if not passed or FALSE, this field will not be processed.</p> 
     * @return ClearNetworkInterfaces <p>Whether to clear the NetworkInterfaces in the launch configuration. If the value is TRUE, clear it; if not passed or FALSE, this field will not be processed.</p>
     */
    public Boolean getClearNetworkInterfaces() {
        return this.ClearNetworkInterfaces;
    }

    /**
     * Set <p>Whether to clear the NetworkInterfaces in the launch configuration. If the value is TRUE, clear it; if not passed or FALSE, this field will not be processed.</p>
     * @param ClearNetworkInterfaces <p>Whether to clear the NetworkInterfaces in the launch configuration. If the value is TRUE, clear it; if not passed or FALSE, this field will not be processed.</p>
     */
    public void setClearNetworkInterfaces(Boolean ClearNetworkInterfaces) {
        this.ClearNetworkInterfaces = ClearNetworkInterfaces;
    }

    public ClearLaunchConfigurationAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClearLaunchConfigurationAttributesRequest(ClearLaunchConfigurationAttributesRequest source) {
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.ClearDataDisks != null) {
            this.ClearDataDisks = new Boolean(source.ClearDataDisks);
        }
        if (source.ClearHostNameSettings != null) {
            this.ClearHostNameSettings = new Boolean(source.ClearHostNameSettings);
        }
        if (source.ClearInstanceNameSettings != null) {
            this.ClearInstanceNameSettings = new Boolean(source.ClearInstanceNameSettings);
        }
        if (source.ClearDisasterRecoverGroupIds != null) {
            this.ClearDisasterRecoverGroupIds = new Boolean(source.ClearDisasterRecoverGroupIds);
        }
        if (source.ClearInstanceTags != null) {
            this.ClearInstanceTags = new Boolean(source.ClearInstanceTags);
        }
        if (source.ClearMetadata != null) {
            this.ClearMetadata = new Boolean(source.ClearMetadata);
        }
        if (source.ClearNetworkInterfaces != null) {
            this.ClearNetworkInterfaces = new Boolean(source.ClearNetworkInterfaces);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "ClearDataDisks", this.ClearDataDisks);
        this.setParamSimple(map, prefix + "ClearHostNameSettings", this.ClearHostNameSettings);
        this.setParamSimple(map, prefix + "ClearInstanceNameSettings", this.ClearInstanceNameSettings);
        this.setParamSimple(map, prefix + "ClearDisasterRecoverGroupIds", this.ClearDisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "ClearInstanceTags", this.ClearInstanceTags);
        this.setParamSimple(map, prefix + "ClearMetadata", this.ClearMetadata);
        this.setParamSimple(map, prefix + "ClearNetworkInterfaces", this.ClearNetworkInterfaces);

    }
}

