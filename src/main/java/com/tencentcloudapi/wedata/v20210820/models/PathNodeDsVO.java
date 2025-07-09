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

public class PathNodeDsVO extends AbstractModel {

    /**
    * PathNode ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * PathNode Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * PathNode Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Unique Identifier of Parent Node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Is Leaf Node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Children")
    @Expose
    private PathNodeDsVO [] Children;

    /**
    * Business Parameters, base64 encoded JSON string, to obtain specific parameters, base64 decoding is required
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get PathNode ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id PathNode ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set PathNode ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id PathNode ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get PathNode Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Title PathNode Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set PathNode Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Title PathNode Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get PathNode Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type PathNode Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set PathNode Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type PathNode Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Unique Identifier of Parent Node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentId Unique Identifier of Parent Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Unique Identifier of Parent Node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentId Unique Identifier of Parent Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Is Leaf Node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsLeaf Is Leaf Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set Is Leaf Node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsLeaf Is Leaf Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get Child Node List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Children Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public PathNodeDsVO [] getChildren() {
        return this.Children;
    }

    /**
     * Set Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Children Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChildren(PathNodeDsVO [] Children) {
        this.Children = Children;
    }

    /**
     * Get Business Parameters, base64 encoded JSON string, to obtain specific parameters, base64 decoding is required
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Params Business Parameters, base64 encoded JSON string, to obtain specific parameters, base64 decoding is required
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Business Parameters, base64 encoded JSON string, to obtain specific parameters, base64 decoding is required
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Params Business Parameters, base64 encoded JSON string, to obtain specific parameters, base64 decoding is required
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public PathNodeDsVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathNodeDsVO(PathNodeDsVO source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.Children != null) {
            this.Children = new PathNodeDsVO[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new PathNodeDsVO(source.Children[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

