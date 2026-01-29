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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AKInfo extends AbstractModel {

    /**
    * ak id.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * ak specific value. returns temporary key when temporary key is used.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Associated account.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get ak id. 
     * @return ID ak id.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ak id.
     * @param ID ak id.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get ak specific value. returns temporary key when temporary key is used. 
     * @return Name ak specific value. returns temporary key when temporary key is used.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ak specific value. returns temporary key when temporary key is used.
     * @param Name ak specific value. returns temporary key when temporary key is used.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Associated account. 
     * @return User Associated account.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Associated account.
     * @param User Associated account.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AKInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AKInfo(AKInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

