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

public class UpdateRecordBackupPlanModify extends AbstractModel {

    /**
    * Recording cloud migration plan name (supports only Chinese, English, digits, _, and -, length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated. This field is not required if the name is not modified.)
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Recording template ID (obtain from the ListRecordBackupTemplates API for querying the video recording upload template list. This field is not required if the template ID is not modified)
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Recording cloud migration plan description (only supports Chinese, English, numbers, _, -, length not exceeding 128 characters. This field is not required if the description is not modified)
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Lifecycle (lifecycle settings for video recording files, managing the time when files are in cold or hot storage. This field is not required if you do not modify the lifecycle)
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * Device channels to be added (Json array; not required when no channels are added; the total number of channels added at once cannot exceed 5000, including the number of channels under the organizational directory)
    */
    @SerializedName("Add")
    @Expose
    private ChannelInfo [] Add;

    /**
    * Device channel to delete (Json array containing the IDs of device channels to delete. Not required if no device channel is deleted)
    */
    @SerializedName("Del")
    @Expose
    private String [] Del;

    /**
    * Add the channels of all devices under the organizational unit (Json array, can be empty, and the total number of channels no more than 5000, including the number of channels in the Add field)
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
     * Get Recording cloud migration plan name (supports only Chinese, English, digits, _, and -, length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated. This field is not required if the name is not modified.) 
     * @return PlanName Recording cloud migration plan name (supports only Chinese, English, digits, _, and -, length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated. This field is not required if the name is not modified.)
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Recording cloud migration plan name (supports only Chinese, English, digits, _, and -, length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated. This field is not required if the name is not modified.)
     * @param PlanName Recording cloud migration plan name (supports only Chinese, English, digits, _, and -, length not exceeding 32 characters. The plan name must be globally unique and cannot be empty or repeated. This field is not required if the name is not modified.)
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Recording template ID (obtain from the ListRecordBackupTemplates API for querying the video recording upload template list. This field is not required if the template ID is not modified) 
     * @return TemplateId Recording template ID (obtain from the ListRecordBackupTemplates API for querying the video recording upload template list. This field is not required if the template ID is not modified)
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Recording template ID (obtain from the ListRecordBackupTemplates API for querying the video recording upload template list. This field is not required if the template ID is not modified)
     * @param TemplateId Recording template ID (obtain from the ListRecordBackupTemplates API for querying the video recording upload template list. This field is not required if the template ID is not modified)
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Recording cloud migration plan description (only supports Chinese, English, numbers, _, -, length not exceeding 128 characters. This field is not required if the description is not modified) 
     * @return Describe Recording cloud migration plan description (only supports Chinese, English, numbers, _, -, length not exceeding 128 characters. This field is not required if the description is not modified)
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Recording cloud migration plan description (only supports Chinese, English, numbers, _, -, length not exceeding 128 characters. This field is not required if the description is not modified)
     * @param Describe Recording cloud migration plan description (only supports Chinese, English, numbers, _, -, length not exceeding 128 characters. This field is not required if the description is not modified)
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Lifecycle (lifecycle settings for video recording files, managing the time when files are in cold or hot storage. This field is not required if you do not modify the lifecycle) 
     * @return LifeCycle Lifecycle (lifecycle settings for video recording files, managing the time when files are in cold or hot storage. This field is not required if you do not modify the lifecycle)
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Lifecycle (lifecycle settings for video recording files, managing the time when files are in cold or hot storage. This field is not required if you do not modify the lifecycle)
     * @param LifeCycle Lifecycle (lifecycle settings for video recording files, managing the time when files are in cold or hot storage. This field is not required if you do not modify the lifecycle)
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Device channels to be added (Json array; not required when no channels are added; the total number of channels added at once cannot exceed 5000, including the number of channels under the organizational directory) 
     * @return Add Device channels to be added (Json array; not required when no channels are added; the total number of channels added at once cannot exceed 5000, including the number of channels under the organizational directory)
     */
    public ChannelInfo [] getAdd() {
        return this.Add;
    }

    /**
     * Set Device channels to be added (Json array; not required when no channels are added; the total number of channels added at once cannot exceed 5000, including the number of channels under the organizational directory)
     * @param Add Device channels to be added (Json array; not required when no channels are added; the total number of channels added at once cannot exceed 5000, including the number of channels under the organizational directory)
     */
    public void setAdd(ChannelInfo [] Add) {
        this.Add = Add;
    }

    /**
     * Get Device channel to delete (Json array containing the IDs of device channels to delete. Not required if no device channel is deleted) 
     * @return Del Device channel to delete (Json array containing the IDs of device channels to delete. Not required if no device channel is deleted)
     */
    public String [] getDel() {
        return this.Del;
    }

    /**
     * Set Device channel to delete (Json array containing the IDs of device channels to delete. Not required if no device channel is deleted)
     * @param Del Device channel to delete (Json array containing the IDs of device channels to delete. Not required if no device channel is deleted)
     */
    public void setDel(String [] Del) {
        this.Del = Del;
    }

    /**
     * Get Add the channels of all devices under the organizational unit (Json array, can be empty, and the total number of channels no more than 5000, including the number of channels in the Add field) 
     * @return OrganizationId Add the channels of all devices under the organizational unit (Json array, can be empty, and the total number of channels no more than 5000, including the number of channels in the Add field)
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Add the channels of all devices under the organizational unit (Json array, can be empty, and the total number of channels no more than 5000, including the number of channels in the Add field)
     * @param OrganizationId Add the channels of all devices under the organizational unit (Json array, can be empty, and the total number of channels no more than 5000, including the number of channels in the Add field)
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    public UpdateRecordBackupPlanModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordBackupPlanModify(UpdateRecordBackupPlanModify source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamArrayObj(map, prefix + "Add.", this.Add);
        this.setParamArraySimple(map, prefix + "Del.", this.Del);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);

    }
}

