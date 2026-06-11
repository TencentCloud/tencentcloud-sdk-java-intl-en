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

public class CreateCloudProductLogCollectionRequest extends AbstractModel {

    /**
    * <p>Instance ID</p><ul><li>Obtained through official documentation of connected cloud services</li></ul>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS</p>
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * <p>Log type, supports enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Product region. The input parameter format for regions varies by log type (LogType). Refer to the following example:</p><ul><li>All CDS log types: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All DCDB log types: gz</li><li>All MariaDB log types: gz</li><li>All PostgreSQL log types: gz</li><li>All BH log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All APIS log types: gz</li></ul>
    */
    @SerializedName("CloudProductRegion")
    @Expose
    private String CloudProductRegion;

    /**
    * <p>CLS target region</p><ul><li>Supported regions: see <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document</li></ul>
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * <p>Logset name. Required when LogsetId is not specified. If the log set does not exist, it will automatically create one.</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * <p>Log topic name. This parameter is required when TopicId is empty. If the log topic does not exist, the system will automatically create one.</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Log configuration extension info, generally used to store additional log delivery configuration</p>
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * <p>log set id</p><ul><li>Obtain the log set Id through <a href="https://www.tencentcloud.com/document/api/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Tag description list. By specifying this parameter, you can simultaneously bind tags to the appropriate theme. Supports up to 10 tag key-value pairs. The same resource can only be bound to the same tag key.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>Instance ID</p><ul><li>Obtained through official documentation of connected cloud services</li></ul> 
     * @return InstanceId <p>Instance ID</p><ul><li>Obtained through official documentation of connected cloud services</li></ul>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p><ul><li>Obtained through official documentation of connected cloud services</li></ul>
     * @param InstanceId <p>Instance ID</p><ul><li>Obtained through official documentation of connected cloud services</li></ul>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS</p> 
     * @return AssumerName <p>Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS</p>
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set <p>Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS</p>
     * @param AssumerName <p>Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS</p>
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get <p>Log type, supports enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p> 
     * @return LogType <p>Log type, supports enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type, supports enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
     * @param LogType <p>Log type, supports enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Product region. The input parameter format for regions varies by log type (LogType). Refer to the following example:</p><ul><li>All CDS log types: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All DCDB log types: gz</li><li>All MariaDB log types: gz</li><li>All PostgreSQL log types: gz</li><li>All BH log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All APIS log types: gz</li></ul> 
     * @return CloudProductRegion <p>Product region. The input parameter format for regions varies by log type (LogType). Refer to the following example:</p><ul><li>All CDS log types: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All DCDB log types: gz</li><li>All MariaDB log types: gz</li><li>All PostgreSQL log types: gz</li><li>All BH log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All APIS log types: gz</li></ul>
     */
    public String getCloudProductRegion() {
        return this.CloudProductRegion;
    }

    /**
     * Set <p>Product region. The input parameter format for regions varies by log type (LogType). Refer to the following example:</p><ul><li>All CDS log types: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All DCDB log types: gz</li><li>All MariaDB log types: gz</li><li>All PostgreSQL log types: gz</li><li>All BH log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All APIS log types: gz</li></ul>
     * @param CloudProductRegion <p>Product region. The input parameter format for regions varies by log type (LogType). Refer to the following example:</p><ul><li>All CDS log types: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All DCDB log types: gz</li><li>All MariaDB log types: gz</li><li>All PostgreSQL log types: gz</li><li>All BH log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All APIS log types: gz</li></ul>
     */
    public void setCloudProductRegion(String CloudProductRegion) {
        this.CloudProductRegion = CloudProductRegion;
    }

    /**
     * Get <p>CLS target region</p><ul><li>Supported regions: see <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document</li></ul> 
     * @return ClsRegion <p>CLS target region</p><ul><li>Supported regions: see <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document</li></ul>
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set <p>CLS target region</p><ul><li>Supported regions: see <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document</li></ul>
     * @param ClsRegion <p>CLS target region</p><ul><li>Supported regions: see <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document</li></ul>
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    /**
     * Get <p>Logset name. Required when LogsetId is not specified. If the log set does not exist, it will automatically create one.</p> 
     * @return LogsetName <p>Logset name. Required when LogsetId is not specified. If the log set does not exist, it will automatically create one.</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>Logset name. Required when LogsetId is not specified. If the log set does not exist, it will automatically create one.</p>
     * @param LogsetName <p>Logset name. Required when LogsetId is not specified. If the log set does not exist, it will automatically create one.</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get <p>Log topic name. This parameter is required when TopicId is empty. If the log topic does not exist, the system will automatically create one.</p> 
     * @return TopicName <p>Log topic name. This parameter is required when TopicId is empty. If the log topic does not exist, the system will automatically create one.</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Log topic name. This parameter is required when TopicId is empty. If the log topic does not exist, the system will automatically create one.</p>
     * @param TopicName <p>Log topic name. This parameter is required when TopicId is empty. If the log topic does not exist, the system will automatically create one.</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Log configuration extension info, generally used to store additional log delivery configuration</p> 
     * @return Extend <p>Log configuration extension info, generally used to store additional log delivery configuration</p>
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set <p>Log configuration extension info, generally used to store additional log delivery configuration</p>
     * @param Extend <p>Log configuration extension info, generally used to store additional log delivery configuration</p>
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    /**
     * Get <p>log set id</p><ul><li>Obtain the log set Id through <a href="https://www.tencentcloud.com/document/api/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul> 
     * @return LogsetId <p>log set id</p><ul><li>Obtain the log set Id through <a href="https://www.tencentcloud.com/document/api/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>log set id</p><ul><li>Obtain the log set Id through <a href="https://www.tencentcloud.com/document/api/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
     * @param LogsetId <p>log set id</p><ul><li>Obtain the log set Id through <a href="https://www.tencentcloud.com/document/api/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul> 
     * @return TopicId <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     * @param TopicId <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Tag description list. By specifying this parameter, you can simultaneously bind tags to the appropriate theme. Supports up to 10 tag key-value pairs. The same resource can only be bound to the same tag key.</p> 
     * @return Tags <p>Tag description list. By specifying this parameter, you can simultaneously bind tags to the appropriate theme. Supports up to 10 tag key-value pairs. The same resource can only be bound to the same tag key.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag description list. By specifying this parameter, you can simultaneously bind tags to the appropriate theme. Supports up to 10 tag key-value pairs. The same resource can only be bound to the same tag key.</p>
     * @param Tags <p>Tag description list. By specifying this parameter, you can simultaneously bind tags to the appropriate theme. Supports up to 10 tag key-value pairs. The same resource can only be bound to the same tag key.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateCloudProductLogCollectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudProductLogCollectionRequest(CreateCloudProductLogCollectionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.CloudProductRegion != null) {
            this.CloudProductRegion = new String(source.CloudProductRegion);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "CloudProductRegion", this.CloudProductRegion);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

