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

public class ErrorLogDetail extends AbstractModel {

    /**
    * Username.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Database.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * The time an error was reported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorTime")
    @Expose
    private String ErrorTime;

    /**
    * Error message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get Username.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Database.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database Database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database Database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get The time an error was reported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorTime The time an error was reported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorTime() {
        return this.ErrorTime;
    }

    /**
     * Set The time an error was reported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorTime The time an error was reported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorTime(String ErrorTime) {
        this.ErrorTime = ErrorTime;
    }

    /**
     * Get Error message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Error message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Error message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Error message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ErrorLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorLogDetail(ErrorLogDetail source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.ErrorTime != null) {
            this.ErrorTime = new String(source.ErrorTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "ErrorTime", this.ErrorTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

