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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Target backup method. Valid values: `logical` (logical cold backup), `physical` (physical cold backup), `snapshot` (snapshot backup). Basic Edition instances only support snapshot backups.
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Database table information to be backed up. If this parameter is not set, the whole instance is backed up by default. This parameter can only be set when BackupMethod=logical. The specified database and tables must exist. Otherwise, backup may fail.
If necessary to back up tables tb1 and tb2 in database db1 and database db2, configure the parameter as [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}].
    */
    @SerializedName("BackupDBTableList")
    @Expose
    private BackupItem [] BackupDBTableList;

    /**
    * Manually back up the alias. Keep the input length within 60 characters.
    */
    @SerializedName("ManualBackupName")
    @Expose
    private String ManualBackupName;

    /**
    * Whether the physical backup needs encryption, optional values: on - yes, off - no. This value is meaningful only when BackupMethod is physical. If not specified, use the default encryption policy of instance backup. Here, the default encryption policy refers to the current instance encryption policy queried via the api for the query [DescribeBackupEncryptionStatus](https://www.tencentcloud.com/document/product/236/86508?from_cn_redirect=1).
    */
    @SerializedName("EncryptionFlag")
    @Expose
    private String EncryptionFlag;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Target backup method. Valid values: `logical` (logical cold backup), `physical` (physical cold backup), `snapshot` (snapshot backup). Basic Edition instances only support snapshot backups. 
     * @return BackupMethod Target backup method. Valid values: `logical` (logical cold backup), `physical` (physical cold backup), `snapshot` (snapshot backup). Basic Edition instances only support snapshot backups.
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Target backup method. Valid values: `logical` (logical cold backup), `physical` (physical cold backup), `snapshot` (snapshot backup). Basic Edition instances only support snapshot backups.
     * @param BackupMethod Target backup method. Valid values: `logical` (logical cold backup), `physical` (physical cold backup), `snapshot` (snapshot backup). Basic Edition instances only support snapshot backups.
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Database table information to be backed up. If this parameter is not set, the whole instance is backed up by default. This parameter can only be set when BackupMethod=logical. The specified database and tables must exist. Otherwise, backup may fail.
If necessary to back up tables tb1 and tb2 in database db1 and database db2, configure the parameter as [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}]. 
     * @return BackupDBTableList Database table information to be backed up. If this parameter is not set, the whole instance is backed up by default. This parameter can only be set when BackupMethod=logical. The specified database and tables must exist. Otherwise, backup may fail.
If necessary to back up tables tb1 and tb2 in database db1 and database db2, configure the parameter as [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}].
     */
    public BackupItem [] getBackupDBTableList() {
        return this.BackupDBTableList;
    }

    /**
     * Set Database table information to be backed up. If this parameter is not set, the whole instance is backed up by default. This parameter can only be set when BackupMethod=logical. The specified database and tables must exist. Otherwise, backup may fail.
If necessary to back up tables tb1 and tb2 in database db1 and database db2, configure the parameter as [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}].
     * @param BackupDBTableList Database table information to be backed up. If this parameter is not set, the whole instance is backed up by default. This parameter can only be set when BackupMethod=logical. The specified database and tables must exist. Otherwise, backup may fail.
If necessary to back up tables tb1 and tb2 in database db1 and database db2, configure the parameter as [{"Db": "db1", "Table": "tb1"}, {"Db": "db1", "Table": "tb2"}, {"Db": "db2"}].
     */
    public void setBackupDBTableList(BackupItem [] BackupDBTableList) {
        this.BackupDBTableList = BackupDBTableList;
    }

    /**
     * Get Manually back up the alias. Keep the input length within 60 characters. 
     * @return ManualBackupName Manually back up the alias. Keep the input length within 60 characters.
     */
    public String getManualBackupName() {
        return this.ManualBackupName;
    }

    /**
     * Set Manually back up the alias. Keep the input length within 60 characters.
     * @param ManualBackupName Manually back up the alias. Keep the input length within 60 characters.
     */
    public void setManualBackupName(String ManualBackupName) {
        this.ManualBackupName = ManualBackupName;
    }

    /**
     * Get Whether the physical backup needs encryption, optional values: on - yes, off - no. This value is meaningful only when BackupMethod is physical. If not specified, use the default encryption policy of instance backup. Here, the default encryption policy refers to the current instance encryption policy queried via the api for the query [DescribeBackupEncryptionStatus](https://www.tencentcloud.com/document/product/236/86508?from_cn_redirect=1). 
     * @return EncryptionFlag Whether the physical backup needs encryption, optional values: on - yes, off - no. This value is meaningful only when BackupMethod is physical. If not specified, use the default encryption policy of instance backup. Here, the default encryption policy refers to the current instance encryption policy queried via the api for the query [DescribeBackupEncryptionStatus](https://www.tencentcloud.com/document/product/236/86508?from_cn_redirect=1).
     */
    public String getEncryptionFlag() {
        return this.EncryptionFlag;
    }

    /**
     * Set Whether the physical backup needs encryption, optional values: on - yes, off - no. This value is meaningful only when BackupMethod is physical. If not specified, use the default encryption policy of instance backup. Here, the default encryption policy refers to the current instance encryption policy queried via the api for the query [DescribeBackupEncryptionStatus](https://www.tencentcloud.com/document/product/236/86508?from_cn_redirect=1).
     * @param EncryptionFlag Whether the physical backup needs encryption, optional values: on - yes, off - no. This value is meaningful only when BackupMethod is physical. If not specified, use the default encryption policy of instance backup. Here, the default encryption policy refers to the current instance encryption policy queried via the api for the query [DescribeBackupEncryptionStatus](https://www.tencentcloud.com/document/product/236/86508?from_cn_redirect=1).
     */
    public void setEncryptionFlag(String EncryptionFlag) {
        this.EncryptionFlag = EncryptionFlag;
    }

    public CreateBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupRequest(CreateBackupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupDBTableList != null) {
            this.BackupDBTableList = new BackupItem[source.BackupDBTableList.length];
            for (int i = 0; i < source.BackupDBTableList.length; i++) {
                this.BackupDBTableList[i] = new BackupItem(source.BackupDBTableList[i]);
            }
        }
        if (source.ManualBackupName != null) {
            this.ManualBackupName = new String(source.ManualBackupName);
        }
        if (source.EncryptionFlag != null) {
            this.EncryptionFlag = new String(source.EncryptionFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamArrayObj(map, prefix + "BackupDBTableList.", this.BackupDBTableList);
        this.setParamSimple(map, prefix + "ManualBackupName", this.ManualBackupName);
        this.setParamSimple(map, prefix + "EncryptionFlag", this.EncryptionFlag);

    }
}

