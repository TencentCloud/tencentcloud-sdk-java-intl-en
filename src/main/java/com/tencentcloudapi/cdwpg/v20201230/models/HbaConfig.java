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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HbaConfig extends AbstractModel {

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Database.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * User.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * IP address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Method.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Indicates whether to perform overwriting.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mask")
    @Expose
    private String Mask;

    /**
     * Get Type. 
     * @return Type Type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Database. 
     * @return Database Database.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database.
     * @param Database Database.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get User. 
     * @return User User.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User.
     * @param User User.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get IP address. 
     * @return Address IP address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set IP address.
     * @param Address IP address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Method. 
     * @return Method Method.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Method.
     * @param Method Method.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Indicates whether to perform overwriting.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mask Indicates whether to perform overwriting.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMask() {
        return this.Mask;
    }

    /**
     * Set Indicates whether to perform overwriting.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mask Indicates whether to perform overwriting.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMask(String Mask) {
        this.Mask = Mask;
    }

    public HbaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HbaConfig(HbaConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Mask != null) {
            this.Mask = new String(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}

