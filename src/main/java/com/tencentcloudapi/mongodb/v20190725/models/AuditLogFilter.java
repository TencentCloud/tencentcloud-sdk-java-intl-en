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

public class AuditLogFilter extends AbstractModel {

    /**
    * Client IP address.
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * Username.
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * Execution time. Unit: ms. Filter audit logs with execution time more than this value.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Number of affected rows. Filter audit logs with affected rows more than this value.
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * Operation type.
    */
    @SerializedName("Atype")
    @Expose
    private String [] Atype;

    /**
    * Execution result.
    */
    @SerializedName("Result")
    @Expose
    private String [] Result;

    /**
    * Filter logs using this keyword
    */
    @SerializedName("Param")
    @Expose
    private String [] Param;

    /**
     * Get Client IP address. 
     * @return Host Client IP address.
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set Client IP address.
     * @param Host Client IP address.
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get Username. 
     * @return User Username.
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set Username.
     * @param User Username.
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get Execution time. Unit: ms. Filter audit logs with execution time more than this value. 
     * @return ExecTime Execution time. Unit: ms. Filter audit logs with execution time more than this value.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time. Unit: ms. Filter audit logs with execution time more than this value.
     * @param ExecTime Execution time. Unit: ms. Filter audit logs with execution time more than this value.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Number of affected rows. Filter audit logs with affected rows more than this value. 
     * @return AffectRows Number of affected rows. Filter audit logs with affected rows more than this value.
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set Number of affected rows. Filter audit logs with affected rows more than this value.
     * @param AffectRows Number of affected rows. Filter audit logs with affected rows more than this value.
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get Operation type. 
     * @return Atype Operation type.
     */
    public String [] getAtype() {
        return this.Atype;
    }

    /**
     * Set Operation type.
     * @param Atype Operation type.
     */
    public void setAtype(String [] Atype) {
        this.Atype = Atype;
    }

    /**
     * Get Execution result. 
     * @return Result Execution result.
     */
    public String [] getResult() {
        return this.Result;
    }

    /**
     * Set Execution result.
     * @param Result Execution result.
     */
    public void setResult(String [] Result) {
        this.Result = Result;
    }

    /**
     * Get Filter logs using this keyword 
     * @return Param Filter logs using this keyword
     */
    public String [] getParam() {
        return this.Param;
    }

    /**
     * Set Filter logs using this keyword
     * @param Param Filter logs using this keyword
     */
    public void setParam(String [] Param) {
        this.Param = Param;
    }

    public AuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFilter(AuditLogFilter source) {
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.Atype != null) {
            this.Atype = new String[source.Atype.length];
            for (int i = 0; i < source.Atype.length; i++) {
                this.Atype[i] = new String(source.Atype[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new String(source.Result[i]);
            }
        }
        if (source.Param != null) {
            this.Param = new String[source.Param.length];
            for (int i = 0; i < source.Param.length; i++) {
                this.Param[i] = new String(source.Param[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamArraySimple(map, prefix + "Atype.", this.Atype);
        this.setParamArraySimple(map, prefix + "Result.", this.Result);
        this.setParamArraySimple(map, prefix + "Param.", this.Param);

    }
}

