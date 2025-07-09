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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessDetailInfo extends AbstractModel {

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process permission
    */
    @SerializedName("ProcessAuthority")
    @Expose
    private String ProcessAuthority;

    /**
    * Process PID
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * Process initiator
    */
    @SerializedName("ProcessStartUser")
    @Expose
    private String ProcessStartUser;

    /**
    * Process user group
    */
    @SerializedName("ProcessUserGroup")
    @Expose
    private String ProcessUserGroup;

    /**
    * Process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Process tree
    */
    @SerializedName("ProcessTree")
    @Expose
    private String ProcessTree;

    /**
    * Process MD5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * Process command line parameter
    */
    @SerializedName("ProcessParam")
    @Expose
    private String ProcessParam;

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Process permission 
     * @return ProcessAuthority Process permission
     */
    public String getProcessAuthority() {
        return this.ProcessAuthority;
    }

    /**
     * Set Process permission
     * @param ProcessAuthority Process permission
     */
    public void setProcessAuthority(String ProcessAuthority) {
        this.ProcessAuthority = ProcessAuthority;
    }

    /**
     * Get Process PID 
     * @return ProcessId Process PID
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set Process PID
     * @param ProcessId Process PID
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get Process initiator 
     * @return ProcessStartUser Process initiator
     */
    public String getProcessStartUser() {
        return this.ProcessStartUser;
    }

    /**
     * Set Process initiator
     * @param ProcessStartUser Process initiator
     */
    public void setProcessStartUser(String ProcessStartUser) {
        this.ProcessStartUser = ProcessStartUser;
    }

    /**
     * Get Process user group 
     * @return ProcessUserGroup Process user group
     */
    public String getProcessUserGroup() {
        return this.ProcessUserGroup;
    }

    /**
     * Set Process user group
     * @param ProcessUserGroup Process user group
     */
    public void setProcessUserGroup(String ProcessUserGroup) {
        this.ProcessUserGroup = ProcessUserGroup;
    }

    /**
     * Get Process path 
     * @return ProcessPath Process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
     * @param ProcessPath Process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Process tree 
     * @return ProcessTree Process tree
     */
    public String getProcessTree() {
        return this.ProcessTree;
    }

    /**
     * Set Process tree
     * @param ProcessTree Process tree
     */
    public void setProcessTree(String ProcessTree) {
        this.ProcessTree = ProcessTree;
    }

    /**
     * Get Process MD5 
     * @return ProcessMd5 Process MD5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set Process MD5
     * @param ProcessMd5 Process MD5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get Process command line parameter 
     * @return ProcessParam Process command line parameter
     */
    public String getProcessParam() {
        return this.ProcessParam;
    }

    /**
     * Set Process command line parameter
     * @param ProcessParam Process command line parameter
     */
    public void setProcessParam(String ProcessParam) {
        this.ProcessParam = ProcessParam;
    }

    public ProcessDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessDetailInfo(ProcessDetailInfo source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessAuthority != null) {
            this.ProcessAuthority = new String(source.ProcessAuthority);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ProcessStartUser != null) {
            this.ProcessStartUser = new String(source.ProcessStartUser);
        }
        if (source.ProcessUserGroup != null) {
            this.ProcessUserGroup = new String(source.ProcessUserGroup);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessTree != null) {
            this.ProcessTree = new String(source.ProcessTree);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.ProcessParam != null) {
            this.ProcessParam = new String(source.ProcessParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessAuthority", this.ProcessAuthority);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessStartUser", this.ProcessStartUser);
        this.setParamSimple(map, prefix + "ProcessUserGroup", this.ProcessUserGroup);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessTree", this.ProcessTree);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "ProcessParam", this.ProcessParam);

    }
}

