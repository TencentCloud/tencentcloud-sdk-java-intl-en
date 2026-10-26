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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRecordPlanRequest extends AbstractModel {

    /**
    * Real-time cloud migration plan name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated.
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Real-time cloud template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Lifecycle
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * Cloud plan description. Supports only Chinese, English, digits, _, and -. Length not exceeding 128 characters.
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Stream type. default: The stream type is not specified, and the default push type of the device is used. main: Main stream. sub: Substream. Other values are customized based on the device capacity. If not specified, the default type is used. The length cannot exceed 32 bytes.
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * Channel information of the device to which video recording is added. You can add no more than 5000 channels only once, including the number of channels under the organizational unit directory.
    */
    @SerializedName("Channels")
    @Expose
    private ChannelInfo [] Channels;

    /**
    * Add all device channels under the organization. Json array, can be empty. The total number of channels cannot exceed 5,000 (including the number of Channel fields).
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
    * Video recording supplement mode (0: disabled, 1: enabled). If this field is not specified, it is not enabled by default.
    */
    @SerializedName("RepairMode")
    @Expose
    private Long RepairMode;

    /**
     * Get Real-time cloud migration plan name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated. 
     * @return PlanName Real-time cloud migration plan name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated.
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Real-time cloud migration plan name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated.
     * @param PlanName Real-time cloud migration plan name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated.
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Real-time cloud template ID 
     * @return TemplateId Real-time cloud template ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Real-time cloud template ID
     * @param TemplateId Real-time cloud template ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Lifecycle 
     * @return LifeCycle Lifecycle
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Lifecycle
     * @param LifeCycle Lifecycle
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Cloud plan description. Supports only Chinese, English, digits, _, and -. Length not exceeding 128 characters. 
     * @return Describe Cloud plan description. Supports only Chinese, English, digits, _, and -. Length not exceeding 128 characters.
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Cloud plan description. Supports only Chinese, English, digits, _, and -. Length not exceeding 128 characters.
     * @param Describe Cloud plan description. Supports only Chinese, English, digits, _, and -. Length not exceeding 128 characters.
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Stream type. default: The stream type is not specified, and the default push type of the device is used. main: Main stream. sub: Substream. Other values are customized based on the device capacity. If not specified, the default type is used. The length cannot exceed 32 bytes. 
     * @return StreamType Stream type. default: The stream type is not specified, and the default push type of the device is used. main: Main stream. sub: Substream. Other values are customized based on the device capacity. If not specified, the default type is used. The length cannot exceed 32 bytes.
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Stream type. default: The stream type is not specified, and the default push type of the device is used. main: Main stream. sub: Substream. Other values are customized based on the device capacity. If not specified, the default type is used. The length cannot exceed 32 bytes.
     * @param StreamType Stream type. default: The stream type is not specified, and the default push type of the device is used. main: Main stream. sub: Substream. Other values are customized based on the device capacity. If not specified, the default type is used. The length cannot exceed 32 bytes.
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Channel information of the device to which video recording is added. You can add no more than 5000 channels only once, including the number of channels under the organizational unit directory. 
     * @return Channels Channel information of the device to which video recording is added. You can add no more than 5000 channels only once, including the number of channels under the organizational unit directory.
     */
    public ChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set Channel information of the device to which video recording is added. You can add no more than 5000 channels only once, including the number of channels under the organizational unit directory.
     * @param Channels Channel information of the device to which video recording is added. You can add no more than 5000 channels only once, including the number of channels under the organizational unit directory.
     */
    public void setChannels(ChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get Add all device channels under the organization. Json array, can be empty. The total number of channels cannot exceed 5,000 (including the number of Channel fields). 
     * @return OrganizationId Add all device channels under the organization. Json array, can be empty. The total number of channels cannot exceed 5,000 (including the number of Channel fields).
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Add all device channels under the organization. Json array, can be empty. The total number of channels cannot exceed 5,000 (including the number of Channel fields).
     * @param OrganizationId Add all device channels under the organization. Json array, can be empty. The total number of channels cannot exceed 5,000 (including the number of Channel fields).
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get Video recording supplement mode (0: disabled, 1: enabled). If this field is not specified, it is not enabled by default. 
     * @return RepairMode Video recording supplement mode (0: disabled, 1: enabled). If this field is not specified, it is not enabled by default.
     */
    public Long getRepairMode() {
        return this.RepairMode;
    }

    /**
     * Set Video recording supplement mode (0: disabled, 1: enabled). If this field is not specified, it is not enabled by default.
     * @param RepairMode Video recording supplement mode (0: disabled, 1: enabled). If this field is not specified, it is not enabled by default.
     */
    public void setRepairMode(Long RepairMode) {
        this.RepairMode = RepairMode;
    }

    public AddRecordPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordPlanRequest(AddRecordPlanRequest source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.Channels != null) {
            this.Channels = new ChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelInfo(source.Channels[i]);
            }
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String[source.OrganizationId.length];
            for (int i = 0; i < source.OrganizationId.length; i++) {
                this.OrganizationId[i] = new String(source.OrganizationId[i]);
            }
        }
        if (source.RepairMode != null) {
            this.RepairMode = new Long(source.RepairMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);
        this.setParamSimple(map, prefix + "RepairMode", this.RepairMode);

    }
}

