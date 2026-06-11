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

public class DeleteCloudProductLogCollectionRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
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
    * <p>Product region. Input parameter format varies for different log types (LogType). Refer to the following example:</p><ul><li>All log types for CDS: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All log types for DCDB: gz</li><li>All log types for MariaDB: gz</li><li>All log types for PostgreSQL: gz</li><li>All log types for BH: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All log types for APIS: gz</li></ul>
    */
    @SerializedName("CloudProductRegion")
    @Expose
    private String CloudProductRegion;

    /**
    * <p>Whether to delete the associated topic</p>
    */
    @SerializedName("IsDeleteTopic")
    @Expose
    private Boolean IsDeleteTopic;

    /**
    * <p>Whether to delete the associated logset. If the logset still has topics, deletion will not be performed.</p>
    */
    @SerializedName("IsDeleteLogset")
    @Expose
    private Boolean IsDeleteLogset;

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
     * Get <p>Product region. Input parameter format varies for different log types (LogType). Refer to the following example:</p><ul><li>All log types for CDS: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All log types for DCDB: gz</li><li>All log types for MariaDB: gz</li><li>All log types for PostgreSQL: gz</li><li>All log types for BH: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All log types for APIS: gz</li></ul> 
     * @return CloudProductRegion <p>Product region. Input parameter format varies for different log types (LogType). Refer to the following example:</p><ul><li>All log types for CDS: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All log types for DCDB: gz</li><li>All log types for MariaDB: gz</li><li>All log types for PostgreSQL: gz</li><li>All log types for BH: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All log types for APIS: gz</li></ul>
     */
    public String getCloudProductRegion() {
        return this.CloudProductRegion;
    }

    /**
     * Set <p>Product region. Input parameter format varies for different log types (LogType). Refer to the following example:</p><ul><li>All log types for CDS: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All log types for DCDB: gz</li><li>All log types for MariaDB: gz</li><li>All log types for PostgreSQL: gz</li><li>All log types for BH: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All log types for APIS: gz</li></ul>
     * @param CloudProductRegion <p>Product region. Input parameter format varies for different log types (LogType). Refer to the following example:</p><ul><li>All log types for CDS: ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog: ap-guangzhou</li><li>MongoDB-ErrorLog: ap-guangzhou</li><li>TDMYSQL-SLOW: gz</li><li>All log types for DCDB: gz</li><li>All log types for MariaDB: gz</li><li>All log types for PostgreSQL: gz</li><li>All log types for BH: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)</li><li>All log types for APIS: gz</li></ul>
     */
    public void setCloudProductRegion(String CloudProductRegion) {
        this.CloudProductRegion = CloudProductRegion;
    }

    /**
     * Get <p>Whether to delete the associated topic</p> 
     * @return IsDeleteTopic <p>Whether to delete the associated topic</p>
     */
    public Boolean getIsDeleteTopic() {
        return this.IsDeleteTopic;
    }

    /**
     * Set <p>Whether to delete the associated topic</p>
     * @param IsDeleteTopic <p>Whether to delete the associated topic</p>
     */
    public void setIsDeleteTopic(Boolean IsDeleteTopic) {
        this.IsDeleteTopic = IsDeleteTopic;
    }

    /**
     * Get <p>Whether to delete the associated logset. If the logset still has topics, deletion will not be performed.</p> 
     * @return IsDeleteLogset <p>Whether to delete the associated logset. If the logset still has topics, deletion will not be performed.</p>
     */
    public Boolean getIsDeleteLogset() {
        return this.IsDeleteLogset;
    }

    /**
     * Set <p>Whether to delete the associated logset. If the logset still has topics, deletion will not be performed.</p>
     * @param IsDeleteLogset <p>Whether to delete the associated logset. If the logset still has topics, deletion will not be performed.</p>
     */
    public void setIsDeleteLogset(Boolean IsDeleteLogset) {
        this.IsDeleteLogset = IsDeleteLogset;
    }

    public DeleteCloudProductLogCollectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudProductLogCollectionRequest(DeleteCloudProductLogCollectionRequest source) {
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
        if (source.IsDeleteTopic != null) {
            this.IsDeleteTopic = new Boolean(source.IsDeleteTopic);
        }
        if (source.IsDeleteLogset != null) {
            this.IsDeleteLogset = new Boolean(source.IsDeleteLogset);
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
        this.setParamSimple(map, prefix + "IsDeleteTopic", this.IsDeleteTopic);
        this.setParamSimple(map, prefix + "IsDeleteLogset", this.IsDeleteLogset);

    }
}

