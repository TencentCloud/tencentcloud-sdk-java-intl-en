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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateInstanceRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance ID array, for example, ["cynosdbbmysql-ins-asd","cynosdbmysql-ins-zxc"]
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * This parameter has been deprecated.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Refund reason type of the instance
    */
    @SerializedName("IsolateReasonTypes")
    @Expose
    private Long [] IsolateReasonTypes;

    /**
    * Supplementary reason for instance return
    */
    @SerializedName("IsolateReason")
    @Expose
    private String IsolateReason;

    /**
    * Retain backups
    */
    @SerializedName("SaveBackup")
    @Expose
    private Boolean SaveBackup;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance ID array, for example, ["cynosdbbmysql-ins-asd","cynosdbmysql-ins-zxc"] 
     * @return InstanceIdList Instance ID array, for example, ["cynosdbbmysql-ins-asd","cynosdbmysql-ins-zxc"]
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set Instance ID array, for example, ["cynosdbbmysql-ins-asd","cynosdbmysql-ins-zxc"]
     * @param InstanceIdList Instance ID array, for example, ["cynosdbbmysql-ins-asd","cynosdbmysql-ins-zxc"]
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get This parameter has been deprecated. 
     * @return DbType This parameter has been deprecated.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set This parameter has been deprecated.
     * @param DbType This parameter has been deprecated.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Refund reason type of the instance 
     * @return IsolateReasonTypes Refund reason type of the instance
     */
    public Long [] getIsolateReasonTypes() {
        return this.IsolateReasonTypes;
    }

    /**
     * Set Refund reason type of the instance
     * @param IsolateReasonTypes Refund reason type of the instance
     */
    public void setIsolateReasonTypes(Long [] IsolateReasonTypes) {
        this.IsolateReasonTypes = IsolateReasonTypes;
    }

    /**
     * Get Supplementary reason for instance return 
     * @return IsolateReason Supplementary reason for instance return
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set Supplementary reason for instance return
     * @param IsolateReason Supplementary reason for instance return
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    /**
     * Get Retain backups 
     * @return SaveBackup Retain backups
     */
    public Boolean getSaveBackup() {
        return this.SaveBackup;
    }

    /**
     * Set Retain backups
     * @param SaveBackup Retain backups
     */
    public void setSaveBackup(Boolean SaveBackup) {
        this.SaveBackup = SaveBackup;
    }

    public IsolateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateInstanceRequest(IsolateInstanceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.IsolateReasonTypes != null) {
            this.IsolateReasonTypes = new Long[source.IsolateReasonTypes.length];
            for (int i = 0; i < source.IsolateReasonTypes.length; i++) {
                this.IsolateReasonTypes[i] = new Long(source.IsolateReasonTypes[i]);
            }
        }
        if (source.IsolateReason != null) {
            this.IsolateReason = new String(source.IsolateReason);
        }
        if (source.SaveBackup != null) {
            this.SaveBackup = new Boolean(source.SaveBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "IsolateReasonTypes.", this.IsolateReasonTypes);
        this.setParamSimple(map, prefix + "IsolateReason", this.IsolateReason);
        this.setParamSimple(map, prefix + "SaveBackup", this.SaveBackup);

    }
}

