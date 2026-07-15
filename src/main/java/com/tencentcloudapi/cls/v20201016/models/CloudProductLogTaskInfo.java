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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudProductLogTaskInfo extends AbstractModel {

    /**
    * <p>Log service region</p>
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Logset ID</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Log topic ID.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Extended information for logging configuration, generally used to store additional log delivery configuration</p>
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * <p>Log type, supports enumeration: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Task status: 0 creating, 1 creation completed, 2 deleting</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Tag information of the topic associated with the delivery task</p>
    */
    @SerializedName("TopicTags")
    @Expose
    private Tag [] TopicTags;

    /**
    * <p>Tag information of the logset associated with the delivery task</p>
    */
    @SerializedName("LogsetTags")
    @Expose
    private Tag [] LogsetTags;

    /**
     * Get <p>Log service region</p> 
     * @return ClsRegion <p>Log service region</p>
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set <p>Log service region</p>
     * @param ClsRegion <p>Log service region</p>
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Logset ID</p> 
     * @return LogsetId <p>Logset ID</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Logset ID</p>
     * @param LogsetId <p>Logset ID</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Log topic ID.</p> 
     * @return TopicId <p>Log topic ID.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic ID.</p>
     * @param TopicId <p>Log topic ID.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Extended information for logging configuration, generally used to store additional log delivery configuration</p> 
     * @return Extend <p>Extended information for logging configuration, generally used to store additional log delivery configuration</p>
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set <p>Extended information for logging configuration, generally used to store additional log delivery configuration</p>
     * @param Extend <p>Extended information for logging configuration, generally used to store additional log delivery configuration</p>
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    /**
     * Get <p>Log type, supports enumeration: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p> 
     * @return LogType <p>Log type, supports enumeration: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type, supports enumeration: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
     * @param LogType <p>Log type, supports enumeration: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Task status: 0 creating, 1 creation completed, 2 deleting</p> 
     * @return Status <p>Task status: 0 creating, 1 creation completed, 2 deleting</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status: 0 creating, 1 creation completed, 2 deleting</p>
     * @param Status <p>Task status: 0 creating, 1 creation completed, 2 deleting</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Tag information of the topic associated with the delivery task</p> 
     * @return TopicTags <p>Tag information of the topic associated with the delivery task</p>
     */
    public Tag [] getTopicTags() {
        return this.TopicTags;
    }

    /**
     * Set <p>Tag information of the topic associated with the delivery task</p>
     * @param TopicTags <p>Tag information of the topic associated with the delivery task</p>
     */
    public void setTopicTags(Tag [] TopicTags) {
        this.TopicTags = TopicTags;
    }

    /**
     * Get <p>Tag information of the logset associated with the delivery task</p> 
     * @return LogsetTags <p>Tag information of the logset associated with the delivery task</p>
     */
    public Tag [] getLogsetTags() {
        return this.LogsetTags;
    }

    /**
     * Set <p>Tag information of the logset associated with the delivery task</p>
     * @param LogsetTags <p>Tag information of the logset associated with the delivery task</p>
     */
    public void setLogsetTags(Tag [] LogsetTags) {
        this.LogsetTags = LogsetTags;
    }

    public CloudProductLogTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudProductLogTaskInfo(CloudProductLogTaskInfo source) {
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TopicTags != null) {
            this.TopicTags = new Tag[source.TopicTags.length];
            for (int i = 0; i < source.TopicTags.length; i++) {
                this.TopicTags[i] = new Tag(source.TopicTags[i]);
            }
        }
        if (source.LogsetTags != null) {
            this.LogsetTags = new Tag[source.LogsetTags.length];
            for (int i = 0; i < source.LogsetTags.length; i++) {
                this.LogsetTags[i] = new Tag(source.LogsetTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TopicTags.", this.TopicTags);
        this.setParamArrayObj(map, prefix + "LogsetTags.", this.LogsetTags);

    }
}

