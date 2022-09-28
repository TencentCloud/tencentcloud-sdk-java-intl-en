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

public class LogTopicDetailInfo extends AbstractModel{

    /**
    * Name of the shipping task.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Region of the logset.
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * Type of the shipping task.
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * List of tasks.
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * ID of the logset.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Name of the logset.
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * Topic ID of the shipping task.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic name of the shipping task.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Retention period of the shipping task topic. Unit: day.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether the shipping task is enabled.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Creation time in the format of YYYY-mm-dd HH:MM:SS.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * ID of the site.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Name of the site.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Whether the shipping task is deleted. Values:
<li>`yes`: The shipping task is deleted;</li>
<li>`no`: The shipping task is not deleted.</li>
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
     * Get Name of the shipping task. 
     * @return TaskName Name of the shipping task.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Name of the shipping task.
     * @param TaskName Name of the shipping task.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Region of the logset. 
     * @return LogSetRegion Region of the logset.
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set Region of the logset.
     * @param LogSetRegion Region of the logset.
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get Type of the shipping task. 
     * @return EntityType Type of the shipping task.
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Type of the shipping task.
     * @param EntityType Type of the shipping task.
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get List of tasks. 
     * @return EntityList List of tasks.
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set List of tasks.
     * @param EntityList List of tasks.
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
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
     * Get Name of the logset. 
     * @return LogSetName Name of the logset.
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set Name of the logset.
     * @param LogSetName Name of the logset.
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get Topic ID of the shipping task. 
     * @return TopicId Topic ID of the shipping task.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID of the shipping task.
     * @param TopicId Topic ID of the shipping task.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic name of the shipping task. 
     * @return TopicName Topic name of the shipping task.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name of the shipping task.
     * @param TopicName Topic name of the shipping task.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Retention period of the shipping task topic. Unit: day. 
     * @return Period Retention period of the shipping task topic. Unit: day.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Retention period of the shipping task topic. Unit: day.
     * @param Period Retention period of the shipping task topic. Unit: day.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether the shipping task is enabled. 
     * @return Enabled Whether the shipping task is enabled.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the shipping task is enabled.
     * @param Enabled Whether the shipping task is enabled.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Creation time in the format of YYYY-mm-dd HH:MM:SS. 
     * @return CreateTime Creation time in the format of YYYY-mm-dd HH:MM:SS.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in the format of YYYY-mm-dd HH:MM:SS.
     * @param CreateTime Creation time in the format of YYYY-mm-dd HH:MM:SS.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Name of the site.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneName Name of the site.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the site.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneName Name of the site.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Whether the shipping task is deleted. Values:
<li>`yes`: The shipping task is deleted;</li>
<li>`no`: The shipping task is not deleted.</li> 
     * @return Deleted Whether the shipping task is deleted. Values:
<li>`yes`: The shipping task is deleted;</li>
<li>`no`: The shipping task is not deleted.</li>
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Whether the shipping task is deleted. Values:
<li>`yes`: The shipping task is deleted;</li>
<li>`no`: The shipping task is not deleted.</li>
     * @param Deleted Whether the shipping task is deleted. Values:
<li>`yes`: The shipping task is deleted;</li>
<li>`no`: The shipping task is not deleted.</li>
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    public LogTopicDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogTopicDetailInfo(LogTopicDetailInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

