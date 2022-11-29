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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogTopicInfo extends AbstractModel{

    /**
    * Name of the task.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Name of the site.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * ID of the logset.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * ID of the log topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Type of the task.
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * Retention period of the log topic.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether the log topic is enabled.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Whether the log topic is deleted.
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Target location. Values:
<li>`cls`: Ship logs to CLS;</li>
<li>`custom_enpoint`: Ship logs to a custom address.</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Region of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * ID of the site.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Type of the shipping task. Values:
<li>`cls`: Ship logs to CLS.</li>
<li>`custom_endpoint`: Ship logs to custom APIs.</li>
    */
    @SerializedName("LogSetType")
    @Expose
    private String LogSetType;

    /**
     * Get Name of the task. 
     * @return TaskName Name of the task.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Name of the task.
     * @param TaskName Name of the task.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Name of the site. 
     * @return ZoneName Name of the site.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the site.
     * @param ZoneName Name of the site.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get ID of the logset. 
     * @return LogSetId ID of the logset.
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set ID of the logset.
     * @param LogSetId ID of the logset.
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get ID of the log topic. 
     * @return TopicId ID of the log topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic.
     * @param TopicId ID of the log topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Type of the task. 
     * @return EntityType Type of the task.
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Type of the task.
     * @param EntityType Type of the task.
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get Retention period of the log topic. 
     * @return Period Retention period of the log topic.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Retention period of the log topic.
     * @param Period Retention period of the log topic.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether the log topic is enabled. 
     * @return Enabled Whether the log topic is enabled.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the log topic is enabled.
     * @param Enabled Whether the log topic is enabled.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Whether the log topic is deleted. 
     * @return Deleted Whether the log topic is deleted.
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Whether the log topic is deleted.
     * @param Deleted Whether the log topic is deleted.
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Target location. Values:
<li>`cls`: Ship logs to CLS;</li>
<li>`custom_enpoint`: Ship logs to a custom address.</li> 
     * @return Target Target location. Values:
<li>`cls`: Ship logs to CLS;</li>
<li>`custom_enpoint`: Ship logs to a custom address.</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target location. Values:
<li>`cls`: Ship logs to CLS;</li>
<li>`custom_enpoint`: Ship logs to a custom address.</li>
     * @param Target Target location. Values:
<li>`cls`: Ship logs to CLS;</li>
<li>`custom_enpoint`: Ship logs to a custom address.</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Region of the logset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogSetRegion Region of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set Region of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogSetRegion Region of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get ID of the site.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId ID of the site.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneId ID of the site.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland).</li> 
     * @return Area Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland).</li>
     * @param Area Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Type of the shipping task. Values:
<li>`cls`: Ship logs to CLS.</li>
<li>`custom_endpoint`: Ship logs to custom APIs.</li> 
     * @return LogSetType Type of the shipping task. Values:
<li>`cls`: Ship logs to CLS.</li>
<li>`custom_endpoint`: Ship logs to custom APIs.</li>
     */
    public String getLogSetType() {
        return this.LogSetType;
    }

    /**
     * Set Type of the shipping task. Values:
<li>`cls`: Ship logs to CLS.</li>
<li>`custom_endpoint`: Ship logs to custom APIs.</li>
     * @param LogSetType Type of the shipping task. Values:
<li>`cls`: Ship logs to CLS.</li>
<li>`custom_endpoint`: Ship logs to custom APIs.</li>
     */
    public void setLogSetType(String LogSetType) {
        this.LogSetType = LogSetType;
    }

    public ClsLogTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogTopicInfo(ClsLogTopicInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogSetType != null) {
            this.LogSetType = new String(source.LogSetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogSetType", this.LogSetType);

    }
}

