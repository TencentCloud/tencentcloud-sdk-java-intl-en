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

public class AddRecordBackupPlanRequest extends AbstractModel {

    /**
    * Recording template ID (template ID associated with the recording schedule, obtained from the ListRecordBackupTemplates API for querying the video cloud template list)
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Recording schedule name (supports Chinese, English, digits, _ and -. The length cannot exceed 32 characters. The plan name must be globally unique and cannot be empty or duplicated.)
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Video recording plan description (only supports Chinese, English, digits, _, -, length not exceeding 128 characters)
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Lifecycle (video recording file lifecycle settings, the time when cold and hot storage is managed for files)
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * Channel and the device to which the channel belongs (channel information of the device to which a video recording is added. Add no more than 5,000 channels at a time, including the number of channels under the organizational unit directory).
    */
    @SerializedName("Channels")
    @Expose
    private ChannelInfo [] Channels;

    /**
    * Add all device channels under the organizational unit directory (Json array, can be empty, total number of channels no more than 5000, including the number of Channel fields)
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
     * Get Recording template ID (template ID associated with the recording schedule, obtained from the ListRecordBackupTemplates API for querying the video cloud template list) 
     * @return TemplateId Recording template ID (template ID associated with the recording schedule, obtained from the ListRecordBackupTemplates API for querying the video cloud template list)
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Recording template ID (template ID associated with the recording schedule, obtained from the ListRecordBackupTemplates API for querying the video cloud template list)
     * @param TemplateId Recording template ID (template ID associated with the recording schedule, obtained from the ListRecordBackupTemplates API for querying the video cloud template list)
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Recording schedule name (supports Chinese, English, digits, _ and -. The length cannot exceed 32 characters. The plan name must be globally unique and cannot be empty or duplicated.) 
     * @return PlanName Recording schedule name (supports Chinese, English, digits, _ and -. The length cannot exceed 32 characters. The plan name must be globally unique and cannot be empty or duplicated.)
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Recording schedule name (supports Chinese, English, digits, _ and -. The length cannot exceed 32 characters. The plan name must be globally unique and cannot be empty or duplicated.)
     * @param PlanName Recording schedule name (supports Chinese, English, digits, _ and -. The length cannot exceed 32 characters. The plan name must be globally unique and cannot be empty or duplicated.)
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Video recording plan description (only supports Chinese, English, digits, _, -, length not exceeding 128 characters) 
     * @return Describe Video recording plan description (only supports Chinese, English, digits, _, -, length not exceeding 128 characters)
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Video recording plan description (only supports Chinese, English, digits, _, -, length not exceeding 128 characters)
     * @param Describe Video recording plan description (only supports Chinese, English, digits, _, -, length not exceeding 128 characters)
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Lifecycle (video recording file lifecycle settings, the time when cold and hot storage is managed for files) 
     * @return LifeCycle Lifecycle (video recording file lifecycle settings, the time when cold and hot storage is managed for files)
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Lifecycle (video recording file lifecycle settings, the time when cold and hot storage is managed for files)
     * @param LifeCycle Lifecycle (video recording file lifecycle settings, the time when cold and hot storage is managed for files)
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Channel and the device to which the channel belongs (channel information of the device to which a video recording is added. Add no more than 5,000 channels at a time, including the number of channels under the organizational unit directory). 
     * @return Channels Channel and the device to which the channel belongs (channel information of the device to which a video recording is added. Add no more than 5,000 channels at a time, including the number of channels under the organizational unit directory).
     */
    public ChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set Channel and the device to which the channel belongs (channel information of the device to which a video recording is added. Add no more than 5,000 channels at a time, including the number of channels under the organizational unit directory).
     * @param Channels Channel and the device to which the channel belongs (channel information of the device to which a video recording is added. Add no more than 5,000 channels at a time, including the number of channels under the organizational unit directory).
     */
    public void setChannels(ChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get Add all device channels under the organizational unit directory (Json array, can be empty, total number of channels no more than 5000, including the number of Channel fields) 
     * @return OrganizationId Add all device channels under the organizational unit directory (Json array, can be empty, total number of channels no more than 5000, including the number of Channel fields)
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Add all device channels under the organizational unit directory (Json array, can be empty, total number of channels no more than 5000, including the number of Channel fields)
     * @param OrganizationId Add all device channels under the organizational unit directory (Json array, can be empty, total number of channels no more than 5000, including the number of Channel fields)
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    public AddRecordBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBackupPlanRequest(AddRecordBackupPlanRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);

    }
}

