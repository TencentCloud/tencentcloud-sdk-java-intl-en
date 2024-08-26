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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterConfigsHistory extends AbstractModel {

    /**
    * Configuration file's name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Modified configuration file content; base64 code
    */
    @SerializedName("NewConfValue")
    @Expose
    private String NewConfValue;

    /**
    * Configuration file content before modification; base64 code
    */
    @SerializedName("OldConfValue")
    @Expose
    private String OldConfValue;

    /**
    * Reason for modification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Modify sub-account ID
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
     * Get Configuration file's name 
     * @return FileName Configuration file's name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Configuration file's name
     * @param FileName Configuration file's name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Modified configuration file content; base64 code 
     * @return NewConfValue Modified configuration file content; base64 code
     */
    public String getNewConfValue() {
        return this.NewConfValue;
    }

    /**
     * Set Modified configuration file content; base64 code
     * @param NewConfValue Modified configuration file content; base64 code
     */
    public void setNewConfValue(String NewConfValue) {
        this.NewConfValue = NewConfValue;
    }

    /**
     * Get Configuration file content before modification; base64 code 
     * @return OldConfValue Configuration file content before modification; base64 code
     */
    public String getOldConfValue() {
        return this.OldConfValue;
    }

    /**
     * Set Configuration file content before modification; base64 code
     * @param OldConfValue Configuration file content before modification; base64 code
     */
    public void setOldConfValue(String OldConfValue) {
        this.OldConfValue = OldConfValue;
    }

    /**
     * Get Reason for modification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Reason for modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Reason for modification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Reason for modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Modify sub-account ID 
     * @return UserUin Modify sub-account ID
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set Modify sub-account ID
     * @param UserUin Modify sub-account ID
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    public ClusterConfigsHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterConfigsHistory(ClusterConfigsHistory source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.NewConfValue != null) {
            this.NewConfValue = new String(source.NewConfValue);
        }
        if (source.OldConfValue != null) {
            this.OldConfValue = new String(source.OldConfValue);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "NewConfValue", this.NewConfValue);
        this.setParamSimple(map, prefix + "OldConfValue", this.OldConfValue);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);

    }
}

