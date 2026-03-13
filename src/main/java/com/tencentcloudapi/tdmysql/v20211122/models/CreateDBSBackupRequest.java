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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBSBackupRequest extends AbstractModel {

    /**
    * <p>Backup method: physical, snapshot. this value should be consistent with the backupMethod in the api response of DescribeDBSBackupPolicy.</p>enumeration value:<ul><li> physical: physical backup</li><li> snapshot: snapshot backup</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <P>Backup type: currently, only supports full.</p>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <P>Backup notes.</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get <p>Backup method: physical, snapshot. this value should be consistent with the backupMethod in the api response of DescribeDBSBackupPolicy.</p>enumeration value:<ul><li> physical: physical backup</li><li> snapshot: snapshot backup</li></ul> 
     * @return BackupMethod <p>Backup method: physical, snapshot. this value should be consistent with the backupMethod in the api response of DescribeDBSBackupPolicy.</p>enumeration value:<ul><li> physical: physical backup</li><li> snapshot: snapshot backup</li></ul>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>Backup method: physical, snapshot. this value should be consistent with the backupMethod in the api response of DescribeDBSBackupPolicy.</p>enumeration value:<ul><li> physical: physical backup</li><li> snapshot: snapshot backup</li></ul>
     * @param BackupMethod <p>Backup method: physical, snapshot. this value should be consistent with the backupMethod in the api response of DescribeDBSBackupPolicy.</p>enumeration value:<ul><li> physical: physical backup</li><li> snapshot: snapshot backup</li></ul>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <P>Backup type: currently, only supports full.</p> 
     * @return BackupType <P>Backup type: currently, only supports full.</p>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <P>Backup type: currently, only supports full.</p>
     * @param BackupType <P>Backup type: currently, only supports full.</p>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
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
     * Get <P>Backup notes.</p> 
     * @return BackupName <P>Backup notes.</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <P>Backup notes.</p>
     * @param BackupName <P>Backup notes.</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    public CreateDBSBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBSBackupRequest(CreateDBSBackupRequest source) {
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

