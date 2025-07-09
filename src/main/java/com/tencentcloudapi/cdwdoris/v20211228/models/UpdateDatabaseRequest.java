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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDatabaseRequest extends AbstractModel {

    /**
    * The database name to be modified
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES. Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * InstanceId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Quota value, which is used to set the quota of data volume or replicas.
    */
    @SerializedName("Quota")
    @Expose
    private String Quota;

    /**
    * New database name, used for renaming operation.
    */
    @SerializedName("NewDbName")
    @Expose
    private String NewDbName;

    /**
    * Attribute key-value pair to be set
    */
    @SerializedName("Properties")
    @Expose
    private PropertiesMap [] Properties;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * The name of the catalog, if left unspecified, defaults to "internal".
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
     * Get The database name to be modified 
     * @return DbName The database name to be modified
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set The database name to be modified
     * @param DbName The database name to be modified
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES. Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES. 
     * @return Operation Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES. Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES. Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES.
     * @param Operation Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES. Modify the operation type, such as SET_QUOTA, RENAME, SET_REPLICA_QUOTA, and SET_PROPERTIES.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get InstanceId 
     * @return InstanceId InstanceId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId
     * @param InstanceId InstanceId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Quota value, which is used to set the quota of data volume or replicas. 
     * @return Quota Quota value, which is used to set the quota of data volume or replicas.
     */
    public String getQuota() {
        return this.Quota;
    }

    /**
     * Set Quota value, which is used to set the quota of data volume or replicas.
     * @param Quota Quota value, which is used to set the quota of data volume or replicas.
     */
    public void setQuota(String Quota) {
        this.Quota = Quota;
    }

    /**
     * Get New database name, used for renaming operation. 
     * @return NewDbName New database name, used for renaming operation.
     */
    public String getNewDbName() {
        return this.NewDbName;
    }

    /**
     * Set New database name, used for renaming operation.
     * @param NewDbName New database name, used for renaming operation.
     */
    public void setNewDbName(String NewDbName) {
        this.NewDbName = NewDbName;
    }

    /**
     * Get Attribute key-value pair to be set 
     * @return Properties Attribute key-value pair to be set
     */
    public PropertiesMap [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Attribute key-value pair to be set
     * @param Properties Attribute key-value pair to be set
     */
    public void setProperties(PropertiesMap [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get The name of the catalog, if left unspecified, defaults to "internal". 
     * @return CatalogName The name of the catalog, if left unspecified, defaults to "internal".
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set The name of the catalog, if left unspecified, defaults to "internal".
     * @param CatalogName The name of the catalog, if left unspecified, defaults to "internal".
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    public UpdateDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDatabaseRequest(UpdateDatabaseRequest source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Quota != null) {
            this.Quota = new String(source.Quota);
        }
        if (source.NewDbName != null) {
            this.NewDbName = new String(source.NewDbName);
        }
        if (source.Properties != null) {
            this.Properties = new PropertiesMap[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new PropertiesMap(source.Properties[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "NewDbName", this.NewDbName);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);

    }
}

