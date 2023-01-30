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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessBaseInfo extends AbstractModel{

    /**
    * Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessStartUser")
    @Expose
    private String ProcessStartUser;

    /**
    * Process user group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessUserGroup")
    @Expose
    private String ProcessUserGroup;

    /**
    * Process path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessParam")
    @Expose
    private String ProcessParam;

    /**
     * Get Process initiator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessStartUser Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessStartUser() {
        return this.ProcessStartUser;
    }

    /**
     * Set Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessStartUser Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessStartUser(String ProcessStartUser) {
        this.ProcessStartUser = ProcessStartUser;
    }

    /**
     * Get Process user group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessUserGroup Process user group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessUserGroup() {
        return this.ProcessUserGroup;
    }

    /**
     * Set Process user group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessUserGroup Process user group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessUserGroup(String ProcessUserGroup) {
        this.ProcessUserGroup = ProcessUserGroup;
    }

    /**
     * Get Process path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessPath Process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessPath Process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessParam Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessParam() {
        return this.ProcessParam;
    }

    /**
     * Set Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessParam Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessParam(String ProcessParam) {
        this.ProcessParam = ProcessParam;
    }

    public ProcessBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessBaseInfo(ProcessBaseInfo source) {
        if (source.ProcessStartUser != null) {
            this.ProcessStartUser = new String(source.ProcessStartUser);
        }
        if (source.ProcessUserGroup != null) {
            this.ProcessUserGroup = new String(source.ProcessUserGroup);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessParam != null) {
            this.ProcessParam = new String(source.ProcessParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessStartUser", this.ProcessStartUser);
        this.setParamSimple(map, prefix + "ProcessUserGroup", this.ProcessUserGroup);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessParam", this.ProcessParam);

    }
}

