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

public class ModifyLogTopicTaskRequest extends AbstractModel{

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Region of the logset.
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

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
    * Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * Name of the shipping task.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * The new topic name. If you do not specify this field, no changes will be made.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * The new logset name.
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * The retention period of the updated logset.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * List of shipping entities to be deleted.
    */
    @SerializedName("DropEntityList")
    @Expose
    private String [] DropEntityList;

    /**
    * List of shipping entities to be added.
    */
    @SerializedName("AddedEntityList")
    @Expose
    private String [] AddedEntityList;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li> 
     * @return EntityType Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
     * @param EntityType Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

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
     * Get The new topic name. If you do not specify this field, no changes will be made. 
     * @return TopicName The new topic name. If you do not specify this field, no changes will be made.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set The new topic name. If you do not specify this field, no changes will be made.
     * @param TopicName The new topic name. If you do not specify this field, no changes will be made.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get The new logset name. 
     * @return LogSetName The new logset name.
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set The new logset name.
     * @param LogSetName The new logset name.
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get The retention period of the updated logset. 
     * @return Period The retention period of the updated logset.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The retention period of the updated logset.
     * @param Period The retention period of the updated logset.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get List of shipping entities to be deleted. 
     * @return DropEntityList List of shipping entities to be deleted.
     */
    public String [] getDropEntityList() {
        return this.DropEntityList;
    }

    /**
     * Set List of shipping entities to be deleted.
     * @param DropEntityList List of shipping entities to be deleted.
     */
    public void setDropEntityList(String [] DropEntityList) {
        this.DropEntityList = DropEntityList;
    }

    /**
     * Get List of shipping entities to be added. 
     * @return AddedEntityList List of shipping entities to be added.
     */
    public String [] getAddedEntityList() {
        return this.AddedEntityList;
    }

    /**
     * Set List of shipping entities to be added.
     * @param AddedEntityList List of shipping entities to be added.
     */
    public void setAddedEntityList(String [] AddedEntityList) {
        this.AddedEntityList = AddedEntityList;
    }

    public ModifyLogTopicTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogTopicTaskRequest(ModifyLogTopicTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
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
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.DropEntityList != null) {
            this.DropEntityList = new String[source.DropEntityList.length];
            for (int i = 0; i < source.DropEntityList.length; i++) {
                this.DropEntityList[i] = new String(source.DropEntityList[i]);
            }
        }
        if (source.AddedEntityList != null) {
            this.AddedEntityList = new String[source.AddedEntityList.length];
            for (int i = 0; i < source.AddedEntityList.length; i++) {
                this.AddedEntityList[i] = new String(source.AddedEntityList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "DropEntityList.", this.DropEntityList);
        this.setParamArraySimple(map, prefix + "AddedEntityList.", this.AddedEntityList);

    }
}

