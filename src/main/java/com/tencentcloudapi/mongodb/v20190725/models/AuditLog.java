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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLog extends AbstractModel {

    /**
    * Number of affected rows
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * Operation type. For example: grantRolesToRole, dropRole.
    */
    @SerializedName("Atype")
    @Expose
    private String Atype;

    /**
    * Execution time. Unit: ms.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Client IP address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Operation parameter. Includes operation parameter information.
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Execution result. 0 indicates success, non-0 indicates failure.
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * User role list. Format: role@db,role@db.
    */
    @SerializedName("Roles")
    @Expose
    private String Roles;

    /**
    * Operation timestamp. Format: YYYY-MM-DD HH:mm:ss.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Username. Format: user@db.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get Number of affected rows 
     * @return AffectRows Number of affected rows
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set Number of affected rows
     * @param AffectRows Number of affected rows
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get Operation type. For example: grantRolesToRole, dropRole. 
     * @return Atype Operation type. For example: grantRolesToRole, dropRole.
     */
    public String getAtype() {
        return this.Atype;
    }

    /**
     * Set Operation type. For example: grantRolesToRole, dropRole.
     * @param Atype Operation type. For example: grantRolesToRole, dropRole.
     */
    public void setAtype(String Atype) {
        this.Atype = Atype;
    }

    /**
     * Get Execution time. Unit: ms. 
     * @return ExecTime Execution time. Unit: ms.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time. Unit: ms.
     * @param ExecTime Execution time. Unit: ms.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Client IP address. 
     * @return Host Client IP address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Client IP address.
     * @param Host Client IP address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Operation parameter. Includes operation parameter information. 
     * @return Param Operation parameter. Includes operation parameter information.
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Operation parameter. Includes operation parameter information.
     * @param Param Operation parameter. Includes operation parameter information.
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Execution result. 0 indicates success, non-0 indicates failure. 
     * @return Result Execution result. 0 indicates success, non-0 indicates failure.
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set Execution result. 0 indicates success, non-0 indicates failure.
     * @param Result Execution result. 0 indicates success, non-0 indicates failure.
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get User role list. Format: role@db,role@db. 
     * @return Roles User role list. Format: role@db,role@db.
     */
    public String getRoles() {
        return this.Roles;
    }

    /**
     * Set User role list. Format: role@db,role@db.
     * @param Roles User role list. Format: role@db,role@db.
     */
    public void setRoles(String Roles) {
        this.Roles = Roles;
    }

    /**
     * Get Operation timestamp. Format: YYYY-MM-DD HH:mm:ss. 
     * @return Timestamp Operation timestamp. Format: YYYY-MM-DD HH:mm:ss.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Operation timestamp. Format: YYYY-MM-DD HH:mm:ss.
     * @param Timestamp Operation timestamp. Format: YYYY-MM-DD HH:mm:ss.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Username. Format: user@db. 
     * @return User Username. Format: user@db.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username. Format: user@db.
     * @param User Username. Format: user@db.
     */
    public void setUser(String User) {
        this.User = User;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.Atype != null) {
            this.Atype = new String(source.Atype);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Roles != null) {
            this.Roles = new String(source.Roles);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "Atype", this.Atype);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Roles", this.Roles);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

