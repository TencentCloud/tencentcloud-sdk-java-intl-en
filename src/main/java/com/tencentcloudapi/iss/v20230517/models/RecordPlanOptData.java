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

public class RecordPlanOptData extends AbstractModel {

    /**
    * Cloud migration plan ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Cloud migration plan name
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Cloud template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Cloud migration plan description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Cloud file lifecycle
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * Stream type. default: The default stream type of the device. main: Main stream. sub: Substream. Other values are customized based on the device capacity.
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * Video recording supplement mode (0: disabled, 1: enabled)
    */
    @SerializedName("RepairMode")
    @Expose
    private Long RepairMode;

    /**
     * Get Cloud migration plan ID 
     * @return PlanId Cloud migration plan ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Cloud migration plan ID
     * @param PlanId Cloud migration plan ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Cloud migration plan name 
     * @return PlanName Cloud migration plan name
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Cloud migration plan name
     * @param PlanName Cloud migration plan name
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Cloud template ID 
     * @return TemplateId Cloud template ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Cloud template ID
     * @param TemplateId Cloud template ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Cloud migration plan description 
     * @return Describe Cloud migration plan description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Cloud migration plan description
     * @param Describe Cloud migration plan description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Cloud file lifecycle 
     * @return LifeCycle Cloud file lifecycle
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Cloud file lifecycle
     * @param LifeCycle Cloud file lifecycle
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Stream type. default: The default stream type of the device. main: Main stream. sub: Substream. Other values are customized based on the device capacity. 
     * @return StreamType Stream type. default: The default stream type of the device. main: Main stream. sub: Substream. Other values are customized based on the device capacity.
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Stream type. default: The default stream type of the device. main: Main stream. sub: Substream. Other values are customized based on the device capacity.
     * @param StreamType Stream type. default: The default stream type of the device. main: Main stream. sub: Substream. Other values are customized based on the device capacity.
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Video recording supplement mode (0: disabled, 1: enabled) 
     * @return RepairMode Video recording supplement mode (0: disabled, 1: enabled)
     */
    public Long getRepairMode() {
        return this.RepairMode;
    }

    /**
     * Set Video recording supplement mode (0: disabled, 1: enabled)
     * @param RepairMode Video recording supplement mode (0: disabled, 1: enabled)
     */
    public void setRepairMode(Long RepairMode) {
        this.RepairMode = RepairMode;
    }

    public RecordPlanOptData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordPlanOptData(RecordPlanOptData source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
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
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.RepairMode != null) {
            this.RepairMode = new Long(source.RepairMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "RepairMode", this.RepairMode);

    }
}

