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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellDetail extends AbstractModel {

    /**
    * Container name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance Status: RUNNING, STOPPED, SHUTDOWN...
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * First detection time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last detection time
    */
    @SerializedName("RecentFoundTime")
    @Expose
    private String RecentFoundTime;

    /**
    * Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Java Loader Class Name
    */
    @SerializedName("ClassLoaderName")
    @Expose
    private String ClassLoaderName;

    /**
    * Parent class name
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * Class file MD5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Inherited API
    */
    @SerializedName("Interfaces")
    @Expose
    private String Interfaces;

    /**
    * Annotation
    */
    @SerializedName("Annotations")
    @Expose
    private String Annotations;

    /**
    * Process ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Java Process Path
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * Java process command line parameters
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * Class name
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Java Memory Horse Binary Code (base64)
    */
    @SerializedName("ClassContent")
    @Expose
    private String ClassContent;

    /**
    * Java Memory Trojan Decompilation Code
    */
    @SerializedName("ClassContentPretty")
    @Expose
    private String ClassContentPretty;

    /**
    * Event description
    */
    @SerializedName("EventDescription")
    @Expose
    private String EventDescription;

    /**
    * Security advice
    */
    @SerializedName("SecurityAdvice")
    @Expose
    private String SecurityAdvice;

    /**
    * Additional host information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Instance status: RUNNING, STOPPED, SHUTDOWN...
    */
    @SerializedName("MachineState")
    @Expose
    private String MachineState;

    /**
     * Get Container name 
     * @return InstanceName Container name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Container name
     * @param InstanceName Container name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance Status: RUNNING, STOPPED, SHUTDOWN... 
     * @return InstanceState Instance Status: RUNNING, STOPPED, SHUTDOWN...
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance Status: RUNNING, STOPPED, SHUTDOWN...
     * @param InstanceState Instance Status: RUNNING, STOPPED, SHUTDOWN...
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other 
     * @return Type Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
     * @param Type Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get First detection time 
     * @return CreateTime First detection time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First detection time
     * @param CreateTime First detection time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last detection time 
     * @return RecentFoundTime Last detection time
     */
    public String getRecentFoundTime() {
        return this.RecentFoundTime;
    }

    /**
     * Set Last detection time
     * @param RecentFoundTime Last detection time
     */
    public void setRecentFoundTime(String RecentFoundTime) {
        this.RecentFoundTime = RecentFoundTime;
    }

    /**
     * Get Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed 
     * @return Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     * @param Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Java Loader Class Name 
     * @return ClassLoaderName Java Loader Class Name
     */
    public String getClassLoaderName() {
        return this.ClassLoaderName;
    }

    /**
     * Set Java Loader Class Name
     * @param ClassLoaderName Java Loader Class Name
     */
    public void setClassLoaderName(String ClassLoaderName) {
        this.ClassLoaderName = ClassLoaderName;
    }

    /**
     * Get Parent class name 
     * @return SuperClassName Parent class name
     */
    public String getSuperClassName() {
        return this.SuperClassName;
    }

    /**
     * Set Parent class name
     * @param SuperClassName Parent class name
     */
    public void setSuperClassName(String SuperClassName) {
        this.SuperClassName = SuperClassName;
    }

    /**
     * Get Class file MD5 
     * @return Md5 Class file MD5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Class file MD5
     * @param Md5 Class file MD5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Inherited API 
     * @return Interfaces Inherited API
     */
    public String getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set Inherited API
     * @param Interfaces Inherited API
     */
    public void setInterfaces(String Interfaces) {
        this.Interfaces = Interfaces;
    }

    /**
     * Get Annotation 
     * @return Annotations Annotation
     */
    public String getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Annotation
     * @param Annotations Annotation
     */
    public void setAnnotations(String Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Process ID 
     * @return Pid Process ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
     * @param Pid Process ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Java Process Path 
     * @return Exe Java Process Path
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Java Process Path
     * @param Exe Java Process Path
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get Java process command line parameters 
     * @return Args Java process command line parameters
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set Java process command line parameters
     * @param Args Java process command line parameters
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get Class name 
     * @return ClassName Class name
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Class name
     * @param ClassName Class name
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Java Memory Horse Binary Code (base64) 
     * @return ClassContent Java Memory Horse Binary Code (base64)
     */
    public String getClassContent() {
        return this.ClassContent;
    }

    /**
     * Set Java Memory Horse Binary Code (base64)
     * @param ClassContent Java Memory Horse Binary Code (base64)
     */
    public void setClassContent(String ClassContent) {
        this.ClassContent = ClassContent;
    }

    /**
     * Get Java Memory Trojan Decompilation Code 
     * @return ClassContentPretty Java Memory Trojan Decompilation Code
     */
    public String getClassContentPretty() {
        return this.ClassContentPretty;
    }

    /**
     * Set Java Memory Trojan Decompilation Code
     * @param ClassContentPretty Java Memory Trojan Decompilation Code
     */
    public void setClassContentPretty(String ClassContentPretty) {
        this.ClassContentPretty = ClassContentPretty;
    }

    /**
     * Get Event description 
     * @return EventDescription Event description
     */
    public String getEventDescription() {
        return this.EventDescription;
    }

    /**
     * Set Event description
     * @param EventDescription Event description
     */
    public void setEventDescription(String EventDescription) {
        this.EventDescription = EventDescription;
    }

    /**
     * Get Security advice 
     * @return SecurityAdvice Security advice
     */
    public String getSecurityAdvice() {
        return this.SecurityAdvice;
    }

    /**
     * Set Security advice
     * @param SecurityAdvice Security advice
     */
    public void setSecurityAdvice(String SecurityAdvice) {
        this.SecurityAdvice = SecurityAdvice;
    }

    /**
     * Get Additional host information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional host information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional host information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional host information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Instance status: RUNNING, STOPPED, SHUTDOWN... 
     * @return MachineState Instance status: RUNNING, STOPPED, SHUTDOWN...
     */
    public String getMachineState() {
        return this.MachineState;
    }

    /**
     * Set Instance status: RUNNING, STOPPED, SHUTDOWN...
     * @param MachineState Instance status: RUNNING, STOPPED, SHUTDOWN...
     */
    public void setMachineState(String MachineState) {
        this.MachineState = MachineState;
    }

    public JavaMemShellDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellDetail(JavaMemShellDetail source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecentFoundTime != null) {
            this.RecentFoundTime = new String(source.RecentFoundTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClassLoaderName != null) {
            this.ClassLoaderName = new String(source.ClassLoaderName);
        }
        if (source.SuperClassName != null) {
            this.SuperClassName = new String(source.SuperClassName);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new String(source.Interfaces);
        }
        if (source.Annotations != null) {
            this.Annotations = new String(source.Annotations);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ClassContent != null) {
            this.ClassContent = new String(source.ClassContent);
        }
        if (source.ClassContentPretty != null) {
            this.ClassContentPretty = new String(source.ClassContentPretty);
        }
        if (source.EventDescription != null) {
            this.EventDescription = new String(source.EventDescription);
        }
        if (source.SecurityAdvice != null) {
            this.SecurityAdvice = new String(source.SecurityAdvice);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.MachineState != null) {
            this.MachineState = new String(source.MachineState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClassLoaderName", this.ClassLoaderName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassContent", this.ClassContent);
        this.setParamSimple(map, prefix + "ClassContentPretty", this.ClassContentPretty);
        this.setParamSimple(map, prefix + "EventDescription", this.EventDescription);
        this.setParamSimple(map, prefix + "SecurityAdvice", this.SecurityAdvice);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "MachineState", this.MachineState);

    }
}

