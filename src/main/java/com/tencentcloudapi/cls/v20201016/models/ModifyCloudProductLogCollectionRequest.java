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

public class ModifyCloudProductLogCollectionRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS.
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * Log type, support enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Cloud product region. Data discrepancies exist in the format of region input parameters for different log types (LogType). Refer to the following example:
-All log types of CDS: ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog:ap-guangzhou
- MongoDB-ErrorLog:ap-guangzhou
- TDMYSQL-SLOW:gz
-All log types of DCDB: gz
-All log types of MariaDB: gz
-PostgreSQL all log types: gz
-BH all log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)
-All log types of APIS: gz
    */
    @SerializedName("CloudProductRegion")
    @Expose
    private String CloudProductRegion;

    /**
    * Logging configuration extended information, normally used to store additional log shipping configuration
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS. 
     * @return AssumerName Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS.
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS.
     * @param AssumerName Cloud product identifier, support enumerate: CDS, CWP, CDB, TDSQL-C, MongoDB, TDStore, DCDB, MariaDB, PostgreSQL, BH, APIS.
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get Log type, support enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS 
     * @return LogType Log type, support enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type, support enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS
     * @param LogType Log type, support enumerate: CDS-AUDIT, CDS-RISK, CDB-AUDIT, TDSQL-C-AUDIT, MongoDB-AUDIT, MongoDB-SlowLog, MongoDB-ErrorLog, TDMYSQL-SLOW, DCDB-AUDIT, DCDB-SLOW, DCDB-ERROR, MariaDB-AUDIT, MariaDB-SLOW, MariaDB-ERROR, PostgreSQL-SLOW, PostgreSQL-ERROR, PostgreSQL-AUDIT, BH-FILELOG, BH-COMMANDLOG, APIS-ACCESS
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Cloud product region. Data discrepancies exist in the format of region input parameters for different log types (LogType). Refer to the following example:
-All log types of CDS: ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog:ap-guangzhou
- MongoDB-ErrorLog:ap-guangzhou
- TDMYSQL-SLOW:gz
-All log types of DCDB: gz
-All log types of MariaDB: gz
-PostgreSQL all log types: gz
-BH all log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)
-All log types of APIS: gz 
     * @return CloudProductRegion Cloud product region. Data discrepancies exist in the format of region input parameters for different log types (LogType). Refer to the following example:
-All log types of CDS: ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog:ap-guangzhou
- MongoDB-ErrorLog:ap-guangzhou
- TDMYSQL-SLOW:gz
-All log types of DCDB: gz
-All log types of MariaDB: gz
-PostgreSQL all log types: gz
-BH all log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)
-All log types of APIS: gz
     */
    public String getCloudProductRegion() {
        return this.CloudProductRegion;
    }

    /**
     * Set Cloud product region. Data discrepancies exist in the format of region input parameters for different log types (LogType). Refer to the following example:
-All log types of CDS: ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog:ap-guangzhou
- MongoDB-ErrorLog:ap-guangzhou
- TDMYSQL-SLOW:gz
-All log types of DCDB: gz
-All log types of MariaDB: gz
-PostgreSQL all log types: gz
-BH all log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)
-All log types of APIS: gz
     * @param CloudProductRegion Cloud product region. Data discrepancies exist in the format of region input parameters for different log types (LogType). Refer to the following example:
-All log types of CDS: ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog:ap-guangzhou
- MongoDB-ErrorLog:ap-guangzhou
- TDMYSQL-SLOW:gz
-All log types of DCDB: gz
-All log types of MariaDB: gz
-PostgreSQL all log types: gz
-BH all log types: overseas-polaris (Hong Kong (China) and other)/fsi-polaris (financial district)/general-polaris (general zone)/intl-sg-prod (international site)
-All log types of APIS: gz
     */
    public void setCloudProductRegion(String CloudProductRegion) {
        this.CloudProductRegion = CloudProductRegion;
    }

    /**
     * Get Logging configuration extended information, normally used to store additional log shipping configuration 
     * @return Extend Logging configuration extended information, normally used to store additional log shipping configuration
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set Logging configuration extended information, normally used to store additional log shipping configuration
     * @param Extend Logging configuration extended information, normally used to store additional log shipping configuration
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    public ModifyCloudProductLogCollectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudProductLogCollectionRequest(ModifyCloudProductLogCollectionRequest source) {
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
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
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
        this.setParamSimple(map, prefix + "Extend", this.Extend);

    }
}

