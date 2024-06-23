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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveCustomFunctionRequest extends AbstractModel {

    /**
    * Function Unique Identifier
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Classification: Window functions, Aggregation functions, Date functions...
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Cluster Engine Instance
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * Class
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Resource list
    */
    @SerializedName("ResourceList")
    @Expose
    private FunctionResource [] ResourceList;

    /**
    * Function Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Usage
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * Parameter description
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * Return value description
    */
    @SerializedName("ReturnDesc")
    @Expose
    private String ReturnDesc;

    /**
    * Sample code
    */
    @SerializedName("Example")
    @Expose
    private String Example;

    /**
    * Project ID, cannot be modified, used by DLC when saving the function
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Database Name, cannot be modified, used by DLC when saving the function
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Function Name, cannot be modified, used by DLC when saving the function
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Function Unique Identifier 
     * @return FunctionId Function Unique Identifier
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function Unique Identifier
     * @param FunctionId Function Unique Identifier
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Classification: Window functions, Aggregation functions, Date functions... 
     * @return Kind Classification: Window functions, Aggregation functions, Date functions...
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Classification: Window functions, Aggregation functions, Date functions...
     * @param Kind Classification: Window functions, Aggregation functions, Date functions...
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Cluster Engine Instance 
     * @return ClusterIdentifier Cluster Engine Instance
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set Cluster Engine Instance
     * @param ClusterIdentifier Cluster Engine Instance
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get Class 
     * @return ClassName Class
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Class
     * @param ClassName Class
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Resource list 
     * @return ResourceList Resource list
     */
    public FunctionResource [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set Resource list
     * @param ResourceList Resource list
     */
    public void setResourceList(FunctionResource [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get Function Description 
     * @return Description Function Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function Description
     * @param Description Function Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Usage 
     * @return Usage Usage
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set Usage
     * @param Usage Usage
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Parameter description 
     * @return ParamDesc Parameter description
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set Parameter description
     * @param ParamDesc Parameter description
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get Return value description 
     * @return ReturnDesc Return value description
     */
    public String getReturnDesc() {
        return this.ReturnDesc;
    }

    /**
     * Set Return value description
     * @param ReturnDesc Return value description
     */
    public void setReturnDesc(String ReturnDesc) {
        this.ReturnDesc = ReturnDesc;
    }

    /**
     * Get Sample code 
     * @return Example Sample code
     */
    public String getExample() {
        return this.Example;
    }

    /**
     * Set Sample code
     * @param Example Sample code
     */
    public void setExample(String Example) {
        this.Example = Example;
    }

    /**
     * Get Project ID, cannot be modified, used by DLC when saving the function 
     * @return ProjectId Project ID, cannot be modified, used by DLC when saving the function
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, cannot be modified, used by DLC when saving the function
     * @param ProjectId Project ID, cannot be modified, used by DLC when saving the function
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Database Name, cannot be modified, used by DLC when saving the function 
     * @return DbName Database Name, cannot be modified, used by DLC when saving the function
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database Name, cannot be modified, used by DLC when saving the function
     * @param DbName Database Name, cannot be modified, used by DLC when saving the function
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Function Name, cannot be modified, used by DLC when saving the function 
     * @return Name Function Name, cannot be modified, used by DLC when saving the function
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Function Name, cannot be modified, used by DLC when saving the function
     * @param Name Function Name, cannot be modified, used by DLC when saving the function
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SaveCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveCustomFunctionRequest(SaveCustomFunctionRequest source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new FunctionResource[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new FunctionResource(source.ResourceList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.ReturnDesc != null) {
            this.ReturnDesc = new String(source.ReturnDesc);
        }
        if (source.Example != null) {
            this.Example = new String(source.Example);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "ReturnDesc", this.ReturnDesc);
        this.setParamSimple(map, prefix + "Example", this.Example);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

