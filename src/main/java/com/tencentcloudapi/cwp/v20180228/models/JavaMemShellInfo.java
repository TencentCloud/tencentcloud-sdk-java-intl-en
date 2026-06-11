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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellInfo extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Server name
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Server IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

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
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host Additional Information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Class name
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Parent class name
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

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
    * Associated class loader.
    */
    @SerializedName("LoaderClassName")
    @Expose
    private String LoaderClassName;

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Server name 
     * @return Alias Server name
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Server name
     * @param Alias Server name
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Server IP address 
     * @return HostIp Server IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server IP address
     * @param HostIp Server IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
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
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host Additional Information 
     * @return MachineExtraInfo Host Additional Information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
     * @param MachineExtraInfo Host Additional Information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
     * Get Associated class loader. 
     * @return LoaderClassName Associated class loader.
     */
    public String getLoaderClassName() {
        return this.LoaderClassName;
    }

    /**
     * Set Associated class loader.
     * @param LoaderClassName Associated class loader.
     */
    public void setLoaderClassName(String LoaderClassName) {
        this.LoaderClassName = LoaderClassName;
    }

    public JavaMemShellInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellInfo(JavaMemShellInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
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
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.SuperClassName != null) {
            this.SuperClassName = new String(source.SuperClassName);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new String(source.Interfaces);
        }
        if (source.Annotations != null) {
            this.Annotations = new String(source.Annotations);
        }
        if (source.LoaderClassName != null) {
            this.LoaderClassName = new String(source.LoaderClassName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "LoaderClassName", this.LoaderClassName);

    }
}

