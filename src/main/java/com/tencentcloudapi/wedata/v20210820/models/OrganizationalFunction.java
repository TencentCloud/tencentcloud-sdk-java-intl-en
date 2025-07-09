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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationalFunction extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Display Name
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Hierarchical Path
    */
    @SerializedName("LayerPath")
    @Expose
    private String LayerPath;

    /**
    * Parent Hierarchical Path
    */
    @SerializedName("ParentLayerPath")
    @Expose
    private String ParentLayerPath;

    /**
    * Function Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Function Classification: Window functions, Aggregation functions, Date functions...
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Function Category: System functions, Custom Definition functions
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Function Status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Function DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Function Usage
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * Function Parameter Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * Function Return Value Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReturnDesc")
    @Expose
    private String ReturnDesc;

    /**
    * Function Example
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Example")
    @Expose
    private String Example;

    /**
    * Cluster Instance Engine IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * Function IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FuncId")
    @Expose
    private String FuncId;

    /**
    * Function Class Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Function Resource List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceList")
    @Expose
    private FunctionVersion [] ResourceList;

    /**
    * Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorUserIds")
    @Expose
    private Long [] OperatorUserIds;

    /**
    * Public cloud Owner ID list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUserIds")
    @Expose
    private Long [] OwnerUserIds;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Submission failed error message
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubmitErrorMsg")
    @Expose
    private String SubmitErrorMsg;

    /**
    * Pattern nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Function Command FormatNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CommandFormat")
    @Expose
    private String CommandFormat;

    /**
    * NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * TimestampNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubmitTimestamp")
    @Expose
    private String SubmitTimestamp;

    /**
    * Function tag
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorUserIdsStr")
    @Expose
    private String [] OperatorUserIdsStr;

    /**
    * Public Cloud Owner ID List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUserIdsStr")
    @Expose
    private String [] OwnerUserIdsStr;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Display Name 
     * @return DisplayName Display Name
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display Name
     * @param DisplayName Display Name
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Hierarchical Path 
     * @return LayerPath Hierarchical Path
     */
    public String getLayerPath() {
        return this.LayerPath;
    }

    /**
     * Set Hierarchical Path
     * @param LayerPath Hierarchical Path
     */
    public void setLayerPath(String LayerPath) {
        this.LayerPath = LayerPath;
    }

    /**
     * Get Parent Hierarchical Path 
     * @return ParentLayerPath Parent Hierarchical Path
     */
    public String getParentLayerPath() {
        return this.ParentLayerPath;
    }

    /**
     * Set Parent Hierarchical Path
     * @param ParentLayerPath Parent Hierarchical Path
     */
    public void setParentLayerPath(String ParentLayerPath) {
        this.ParentLayerPath = ParentLayerPath;
    }

    /**
     * Get Function Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Function Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Function Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type Function Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Function Classification: Window functions, Aggregation functions, Date functions...
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Kind Function Classification: Window functions, Aggregation functions, Date functions...
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Function Classification: Window functions, Aggregation functions, Date functions...
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Kind Function Classification: Window functions, Aggregation functions, Date functions...
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Function Category: System functions, Custom Definition functions
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Category Function Category: System functions, Custom Definition functions
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Function Category: System functions, Custom Definition functions
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Category Function Category: System functions, Custom Definition functions
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Function Status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Function Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Function Status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Function Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Function DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Function DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Function DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Function Usage
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Usage Function Usage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set Function Usage
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Usage Function Usage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Function Parameter Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParamDesc Function Parameter Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set Function Parameter Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParamDesc Function Parameter Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get Function Return Value Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReturnDesc Function Return Value Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getReturnDesc() {
        return this.ReturnDesc;
    }

    /**
     * Set Function Return Value Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReturnDesc Function Return Value Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReturnDesc(String ReturnDesc) {
        this.ReturnDesc = ReturnDesc;
    }

    /**
     * Get Function Example
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Example Function Example
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExample() {
        return this.Example;
    }

    /**
     * Set Function Example
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Example Function Example
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExample(String Example) {
        this.Example = Example;
    }

    /**
     * Get Cluster Instance Engine IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterIdentifier Cluster Instance Engine IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set Cluster Instance Engine IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterIdentifier Cluster Instance Engine IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get Function IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FuncId Function IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFuncId() {
        return this.FuncId;
    }

    /**
     * Set Function IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param FuncId Function IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFuncId(String FuncId) {
        this.FuncId = FuncId;
    }

    /**
     * Get Function Class Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClassName Function Class Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Function Class Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClassName Function Class Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Function Resource List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceList Function Resource List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public FunctionVersion [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set Function Resource List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceList Function Resource List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceList(FunctionVersion [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get Operator ID List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorUserIds Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getOperatorUserIds() {
        return this.OperatorUserIds;
    }

    /**
     * Set Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorUserIds Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorUserIds(Long [] OperatorUserIds) {
        this.OperatorUserIds = OperatorUserIds;
    }

    /**
     * Get Public cloud Owner ID list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUserIds Public cloud Owner ID list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getOwnerUserIds() {
        return this.OwnerUserIds;
    }

    /**
     * Set Public cloud Owner ID list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUserIds Public cloud Owner ID list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUserIds(Long [] OwnerUserIds) {
        this.OwnerUserIds = OwnerUserIds;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DbName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DbName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Submission failed error message
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubmitErrorMsg Submission failed error message
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubmitErrorMsg() {
        return this.SubmitErrorMsg;
    }

    /**
     * Set Submission failed error message
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubmitErrorMsg Submission failed error message
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmitErrorMsg(String SubmitErrorMsg) {
        this.SubmitErrorMsg = SubmitErrorMsg;
    }

    /**
     * Get Pattern nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return SchemaName Pattern nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Pattern nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param SchemaName Pattern nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Function Command FormatNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CommandFormat Function Command FormatNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCommandFormat() {
        return this.CommandFormat;
    }

    /**
     * Set Function Command FormatNote: This field may return null, indicating that no valid value can be obtained.
     * @param CommandFormat Function Command FormatNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCommandFormat(String CommandFormat) {
        this.CommandFormat = CommandFormat;
    }

    /**
     * Get NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerName NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerName NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get TimestampNote: This field may return null, indicating that no valid value can be obtained. 
     * @return SubmitTimestamp TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubmitTimestamp() {
        return this.SubmitTimestamp;
    }

    /**
     * Set TimestampNote: This field may return null, indicating that no valid value can be obtained.
     * @param SubmitTimestamp TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmitTimestamp(String SubmitTimestamp) {
        this.SubmitTimestamp = SubmitTimestamp;
    }

    /**
     * Get Function tag
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tag Function tag
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Function tag
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tag Function tag
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Operator ID List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorUserIdsStr Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getOperatorUserIdsStr() {
        return this.OperatorUserIdsStr;
    }

    /**
     * Set Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorUserIdsStr Operator ID List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorUserIdsStr(String [] OperatorUserIdsStr) {
        this.OperatorUserIdsStr = OperatorUserIdsStr;
    }

    /**
     * Get Public Cloud Owner ID List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUserIdsStr Public Cloud Owner ID List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getOwnerUserIdsStr() {
        return this.OwnerUserIdsStr;
    }

    /**
     * Set Public Cloud Owner ID List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUserIdsStr Public Cloud Owner ID List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUserIdsStr(String [] OwnerUserIdsStr) {
        this.OwnerUserIdsStr = OwnerUserIdsStr;
    }

    public OrganizationalFunction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationalFunction(OrganizationalFunction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.LayerPath != null) {
            this.LayerPath = new String(source.LayerPath);
        }
        if (source.ParentLayerPath != null) {
            this.ParentLayerPath = new String(source.ParentLayerPath);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.FuncId != null) {
            this.FuncId = new String(source.FuncId);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new FunctionVersion[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new FunctionVersion(source.ResourceList[i]);
            }
        }
        if (source.OperatorUserIds != null) {
            this.OperatorUserIds = new Long[source.OperatorUserIds.length];
            for (int i = 0; i < source.OperatorUserIds.length; i++) {
                this.OperatorUserIds[i] = new Long(source.OperatorUserIds[i]);
            }
        }
        if (source.OwnerUserIds != null) {
            this.OwnerUserIds = new Long[source.OwnerUserIds.length];
            for (int i = 0; i < source.OwnerUserIds.length; i++) {
                this.OwnerUserIds[i] = new Long(source.OwnerUserIds[i]);
            }
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SubmitErrorMsg != null) {
            this.SubmitErrorMsg = new String(source.SubmitErrorMsg);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.CommandFormat != null) {
            this.CommandFormat = new String(source.CommandFormat);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.SubmitTimestamp != null) {
            this.SubmitTimestamp = new String(source.SubmitTimestamp);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.OperatorUserIdsStr != null) {
            this.OperatorUserIdsStr = new String[source.OperatorUserIdsStr.length];
            for (int i = 0; i < source.OperatorUserIdsStr.length; i++) {
                this.OperatorUserIdsStr[i] = new String(source.OperatorUserIdsStr[i]);
            }
        }
        if (source.OwnerUserIdsStr != null) {
            this.OwnerUserIdsStr = new String[source.OwnerUserIdsStr.length];
            for (int i = 0; i < source.OwnerUserIdsStr.length; i++) {
                this.OwnerUserIdsStr[i] = new String(source.OwnerUserIdsStr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "LayerPath", this.LayerPath);
        this.setParamSimple(map, prefix + "ParentLayerPath", this.ParentLayerPath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "ReturnDesc", this.ReturnDesc);
        this.setParamSimple(map, prefix + "Example", this.Example);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "FuncId", this.FuncId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamArraySimple(map, prefix + "OperatorUserIds.", this.OperatorUserIds);
        this.setParamArraySimple(map, prefix + "OwnerUserIds.", this.OwnerUserIds);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SubmitErrorMsg", this.SubmitErrorMsg);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "CommandFormat", this.CommandFormat);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "SubmitTimestamp", this.SubmitTimestamp);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArraySimple(map, prefix + "OperatorUserIdsStr.", this.OperatorUserIdsStr);
        this.setParamArraySimple(map, prefix + "OwnerUserIdsStr.", this.OwnerUserIdsStr);

    }
}

