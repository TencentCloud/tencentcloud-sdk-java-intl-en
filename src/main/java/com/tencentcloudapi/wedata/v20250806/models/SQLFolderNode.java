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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLFolderNode extends AbstractModel {

    /**
    * Unique identifier


    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * folder type, script type.

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.

    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Whether it is a leaf node.


    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * Business parameters	

    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Permission scope: SHARED, PRIVATE.

    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
    * Node path.

    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Creator

    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Specifies the permission of the current user for nodes.	

    */
    @SerializedName("NodePermission")
    @Expose
    private String NodePermission;

    /**
    * Sub-node list

    */
    @SerializedName("Children")
    @Expose
    private SQLFolderNode [] Children;

    /**
    * Owner of the file.

    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get Unique identifier

 
     * @return Id Unique identifier


     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique identifier


     * @param Id Unique identifier


     */
    public void setId(String Id) {
        this.Id = Id;
    }

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
     * Get folder type, script type.
 
     * @return Type folder type, script type.

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set folder type, script type.

     * @param Type folder type, script type.

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.
 
     * @return ParentFolderPath Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.

     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.

     * @param ParentFolderPath Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.

     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Whether it is a leaf node.

 
     * @return IsLeaf Whether it is a leaf node.


     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set Whether it is a leaf node.


     * @param IsLeaf Whether it is a leaf node.


     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get Business parameters	
 
     * @return Params Business parameters	

     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Business parameters	

     * @param Params Business parameters	

     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Permission scope: SHARED, PRIVATE.
 
     * @return AccessScope Permission scope: SHARED, PRIVATE.

     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set Permission scope: SHARED, PRIVATE.

     * @param AccessScope Permission scope: SHARED, PRIVATE.

     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get Node path.
 
     * @return Path Node path.

     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Node path.

     * @param Path Node path.

     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Creator
 
     * @return CreateUserUin Creator

     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator

     * @param CreateUserUin Creator

     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Specifies the permission of the current user for nodes.	
 
     * @return NodePermission Specifies the permission of the current user for nodes.	

     */
    public String getNodePermission() {
        return this.NodePermission;
    }

    /**
     * Set Specifies the permission of the current user for nodes.	

     * @param NodePermission Specifies the permission of the current user for nodes.	

     */
    public void setNodePermission(String NodePermission) {
        this.NodePermission = NodePermission;
    }

    /**
     * Get Sub-node list
 
     * @return Children Sub-node list

     */
    public SQLFolderNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set Sub-node list

     * @param Children Sub-node list

     */
    public void setChildren(SQLFolderNode [] Children) {
        this.Children = Children;
    }

    /**
     * Get Owner of the file.
 
     * @return OwnerUin Owner of the file.

     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner of the file.

     * @param OwnerUin Owner of the file.

     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public SQLFolderNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLFolderNode(SQLFolderNode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.NodePermission != null) {
            this.NodePermission = new String(source.NodePermission);
        }
        if (source.Children != null) {
            this.Children = new SQLFolderNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new SQLFolderNode(source.Children[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "NodePermission", this.NodePermission);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

