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

public class UpdateRecordPlanData extends AbstractModel {

    /**
    * Cloud migration plan name, supporting only Chinese, English, digits, _, -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or duplicated. This field is not required if the name is not modified.
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Cloud template ID. This field is not required if the template ID is not modified.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Usage plan description. It can contain only Chinese characters, English letters, digits, underscores (_), and hyphens (-), with a length not exceeding 128 characters. This field is not required if you do not modify the description.
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Stream type. default: The stream type is not specified, and the default push type of the device is used. main: main stream. sub: substream. Other: custom based on the device capability set. The length cannot exceed 32 bytes.
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * Lifecycle, file lifecycle settings, the time when cold and hot storage of files is managed. This field is not required if lifecycle is not modified.
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * Device channels to be added. Json array. This field is not required when no channels are added. The total number of channels added at once cannot exceed 5,000, including the number of channels under the organization directory.
    */
    @SerializedName("Add")
    @Expose
    private ChannelInfo [] Add;

    /**
    * Device channels to delete. Json array. The content is the IDs of the device channels to delete. This field is not required if no device channel is deleted.
    */
    @SerializedName("Del")
    @Expose
    private String [] Del;

    /**
    * Organizational directory ID. Add all device channels under the organizational directory. Json array. Can be empty. And the total number of channels is no more than 5,000 (including the number of channels added in the Add field).
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
    * Video recording supplement mode (0: not enabled, 1: enabled)
    */
    @SerializedName("RepairMode")
    @Expose
    private Long RepairMode;

    /**
     * Get Cloud migration plan name, supporting only Chinese, English, digits, _, -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or duplicated. This field is not required if the name is not modified. 
     * @return PlanName Cloud migration plan name, supporting only Chinese, English, digits, _, -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or duplicated. This field is not required if the name is not modified.
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Cloud migration plan name, supporting only Chinese, English, digits, _, -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or duplicated. This field is not required if the name is not modified.
     * @param PlanName Cloud migration plan name, supporting only Chinese, English, digits, _, -, with a length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or duplicated. This field is not required if the name is not modified.
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Cloud template ID. This field is not required if the template ID is not modified. 
     * @return TemplateId Cloud template ID. This field is not required if the template ID is not modified.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Cloud template ID. This field is not required if the template ID is not modified.
     * @param TemplateId Cloud template ID. This field is not required if the template ID is not modified.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Usage plan description. It can contain only Chinese characters, English letters, digits, underscores (_), and hyphens (-), with a length not exceeding 128 characters. This field is not required if you do not modify the description. 
     * @return Describe Usage plan description. It can contain only Chinese characters, English letters, digits, underscores (_), and hyphens (-), with a length not exceeding 128 characters. This field is not required if you do not modify the description.
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Usage plan description. It can contain only Chinese characters, English letters, digits, underscores (_), and hyphens (-), with a length not exceeding 128 characters. This field is not required if you do not modify the description.
     * @param Describe Usage plan description. It can contain only Chinese characters, English letters, digits, underscores (_), and hyphens (-), with a length not exceeding 128 characters. This field is not required if you do not modify the description.
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Stream type. default: The stream type is not specified, and the default push type of the device is used. main: main stream. sub: substream. Other: custom based on the device capability set. The length cannot exceed 32 bytes. 
     * @return StreamType Stream type. default: The stream type is not specified, and the default push type of the device is used. main: main stream. sub: substream. Other: custom based on the device capability set. The length cannot exceed 32 bytes.
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Stream type. default: The stream type is not specified, and the default push type of the device is used. main: main stream. sub: substream. Other: custom based on the device capability set. The length cannot exceed 32 bytes.
     * @param StreamType Stream type. default: The stream type is not specified, and the default push type of the device is used. main: main stream. sub: substream. Other: custom based on the device capability set. The length cannot exceed 32 bytes.
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Lifecycle, file lifecycle settings, the time when cold and hot storage of files is managed. This field is not required if lifecycle is not modified. 
     * @return LifeCycle Lifecycle, file lifecycle settings, the time when cold and hot storage of files is managed. This field is not required if lifecycle is not modified.
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Lifecycle, file lifecycle settings, the time when cold and hot storage of files is managed. This field is not required if lifecycle is not modified.
     * @param LifeCycle Lifecycle, file lifecycle settings, the time when cold and hot storage of files is managed. This field is not required if lifecycle is not modified.
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Device channels to be added. Json array. This field is not required when no channels are added. The total number of channels added at once cannot exceed 5,000, including the number of channels under the organization directory. 
     * @return Add Device channels to be added. Json array. This field is not required when no channels are added. The total number of channels added at once cannot exceed 5,000, including the number of channels under the organization directory.
     */
    public ChannelInfo [] getAdd() {
        return this.Add;
    }

    /**
     * Set Device channels to be added. Json array. This field is not required when no channels are added. The total number of channels added at once cannot exceed 5,000, including the number of channels under the organization directory.
     * @param Add Device channels to be added. Json array. This field is not required when no channels are added. The total number of channels added at once cannot exceed 5,000, including the number of channels under the organization directory.
     */
    public void setAdd(ChannelInfo [] Add) {
        this.Add = Add;
    }

    /**
     * Get Device channels to delete. Json array. The content is the IDs of the device channels to delete. This field is not required if no device channel is deleted. 
     * @return Del Device channels to delete. Json array. The content is the IDs of the device channels to delete. This field is not required if no device channel is deleted.
     */
    public String [] getDel() {
        return this.Del;
    }

    /**
     * Set Device channels to delete. Json array. The content is the IDs of the device channels to delete. This field is not required if no device channel is deleted.
     * @param Del Device channels to delete. Json array. The content is the IDs of the device channels to delete. This field is not required if no device channel is deleted.
     */
    public void setDel(String [] Del) {
        this.Del = Del;
    }

    /**
     * Get Organizational directory ID. Add all device channels under the organizational directory. Json array. Can be empty. And the total number of channels is no more than 5,000 (including the number of channels added in the Add field). 
     * @return OrganizationId Organizational directory ID. Add all device channels under the organizational directory. Json array. Can be empty. And the total number of channels is no more than 5,000 (including the number of channels added in the Add field).
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Organizational directory ID. Add all device channels under the organizational directory. Json array. Can be empty. And the total number of channels is no more than 5,000 (including the number of channels added in the Add field).
     * @param OrganizationId Organizational directory ID. Add all device channels under the organizational directory. Json array. Can be empty. And the total number of channels is no more than 5,000 (including the number of channels added in the Add field).
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get Video recording supplement mode (0: not enabled, 1: enabled) 
     * @return RepairMode Video recording supplement mode (0: not enabled, 1: enabled)
     */
    public Long getRepairMode() {
        return this.RepairMode;
    }

    /**
     * Set Video recording supplement mode (0: not enabled, 1: enabled)
     * @param RepairMode Video recording supplement mode (0: not enabled, 1: enabled)
     */
    public void setRepairMode(Long RepairMode) {
        this.RepairMode = RepairMode;
    }

    public UpdateRecordPlanData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordPlanData(UpdateRecordPlanData source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.Add != null) {
            this.Add = new ChannelInfo[source.Add.length];
            for (int i = 0; i < source.Add.length; i++) {
                this.Add[i] = new ChannelInfo(source.Add[i]);
            }
        }
        if (source.Del != null) {
            this.Del = new String[source.Del.length];
            for (int i = 0; i < source.Del.length; i++) {
                this.Del[i] = new String(source.Del[i]);
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
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamArrayObj(map, prefix + "Add.", this.Add);
        this.setParamArraySimple(map, prefix + "Del.", this.Del);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);
        this.setParamSimple(map, prefix + "RepairMode", this.RepairMode);

    }
}

