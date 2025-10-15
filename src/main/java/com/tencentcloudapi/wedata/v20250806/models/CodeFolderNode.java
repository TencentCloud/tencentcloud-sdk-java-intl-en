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

public class CodeFolderNode extends AbstractModel {

    /**
    * Unique identifier
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * folder type, script.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    * Specifies the uin of the responsible person for the directory/file.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

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
    private CodeFolderNode [] Children;

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
     * @return Title Name
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Name
     * @param Title Name
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get folder type, script. 
     * @return Type folder type, script.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set folder type, script.
     * @param Type folder type, script.
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Specifies the uin of the responsible person for the directory/file. 
     * @return OwnerUin Specifies the uin of the responsible person for the directory/file.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Specifies the uin of the responsible person for the directory/file.
     * @param OwnerUin Specifies the uin of the responsible person for the directory/file.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
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
    public CodeFolderNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set Sub-node list


     * @param Children Sub-node list


     */
    public void setChildren(CodeFolderNode [] Children) {
        this.Children = Children;
    }

    public CodeFolderNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeFolderNode(CodeFolderNode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.NodePermission != null) {
            this.NodePermission = new String(source.NodePermission);
        }
        if (source.Children != null) {
            this.Children = new CodeFolderNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new CodeFolderNode(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "NodePermission", this.NodePermission);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

