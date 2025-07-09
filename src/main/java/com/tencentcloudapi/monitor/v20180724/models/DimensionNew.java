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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionNew extends AbstractModel {

    /**
    * Dimension key ID displayed on the backend
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Dimension key name displayed on the frontend
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether it is required
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * List of supported operators
    */
    @SerializedName("Operators")
    @Expose
    private Operator [] Operators;

    /**
    * Whether multiple items can be selected
    */
    @SerializedName("IsMultiple")
    @Expose
    private Boolean IsMultiple;

    /**
    * Whether it can be modified after creation
    */
    @SerializedName("IsMutable")
    @Expose
    private Boolean IsMutable;

    /**
    * Whether it is displayed to users
    */
    @SerializedName("IsVisible")
    @Expose
    private Boolean IsVisible;

    /**
    * Whether it can be used to filter policies
    */
    @SerializedName("CanFilterPolicy")
    @Expose
    private Boolean CanFilterPolicy;

    /**
    * Whether it can be used to filter historical alarms
    */
    @SerializedName("CanFilterHistory")
    @Expose
    private Boolean CanFilterHistory;

    /**
    * Whether it can be used as an aggregate dimension
    */
    @SerializedName("CanGroupBy")
    @Expose
    private Boolean CanGroupBy;

    /**
    * Whether it must be used as an aggregate dimension
    */
    @SerializedName("MustGroupBy")
    @Expose
    private Boolean MustGroupBy;

    /**
    * The key to be replaced on the frontend
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowValueReplace")
    @Expose
    private String ShowValueReplace;

    /**
     * Get Dimension key ID displayed on the backend 
     * @return Key Dimension key ID displayed on the backend
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Dimension key ID displayed on the backend
     * @param Key Dimension key ID displayed on the backend
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Dimension key name displayed on the frontend 
     * @return Name Dimension key name displayed on the frontend
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dimension key name displayed on the frontend
     * @param Name Dimension key name displayed on the frontend
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether it is required 
     * @return IsRequired Whether it is required
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set Whether it is required
     * @param IsRequired Whether it is required
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get List of supported operators 
     * @return Operators List of supported operators
     */
    public Operator [] getOperators() {
        return this.Operators;
    }

    /**
     * Set List of supported operators
     * @param Operators List of supported operators
     */
    public void setOperators(Operator [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get Whether multiple items can be selected 
     * @return IsMultiple Whether multiple items can be selected
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set Whether multiple items can be selected
     * @param IsMultiple Whether multiple items can be selected
     */
    public void setIsMultiple(Boolean IsMultiple) {
        this.IsMultiple = IsMultiple;
    }

    /**
     * Get Whether it can be modified after creation 
     * @return IsMutable Whether it can be modified after creation
     */
    public Boolean getIsMutable() {
        return this.IsMutable;
    }

    /**
     * Set Whether it can be modified after creation
     * @param IsMutable Whether it can be modified after creation
     */
    public void setIsMutable(Boolean IsMutable) {
        this.IsMutable = IsMutable;
    }

    /**
     * Get Whether it is displayed to users 
     * @return IsVisible Whether it is displayed to users
     */
    public Boolean getIsVisible() {
        return this.IsVisible;
    }

    /**
     * Set Whether it is displayed to users
     * @param IsVisible Whether it is displayed to users
     */
    public void setIsVisible(Boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    /**
     * Get Whether it can be used to filter policies 
     * @return CanFilterPolicy Whether it can be used to filter policies
     */
    public Boolean getCanFilterPolicy() {
        return this.CanFilterPolicy;
    }

    /**
     * Set Whether it can be used to filter policies
     * @param CanFilterPolicy Whether it can be used to filter policies
     */
    public void setCanFilterPolicy(Boolean CanFilterPolicy) {
        this.CanFilterPolicy = CanFilterPolicy;
    }

    /**
     * Get Whether it can be used to filter historical alarms 
     * @return CanFilterHistory Whether it can be used to filter historical alarms
     */
    public Boolean getCanFilterHistory() {
        return this.CanFilterHistory;
    }

    /**
     * Set Whether it can be used to filter historical alarms
     * @param CanFilterHistory Whether it can be used to filter historical alarms
     */
    public void setCanFilterHistory(Boolean CanFilterHistory) {
        this.CanFilterHistory = CanFilterHistory;
    }

    /**
     * Get Whether it can be used as an aggregate dimension 
     * @return CanGroupBy Whether it can be used as an aggregate dimension
     */
    public Boolean getCanGroupBy() {
        return this.CanGroupBy;
    }

    /**
     * Set Whether it can be used as an aggregate dimension
     * @param CanGroupBy Whether it can be used as an aggregate dimension
     */
    public void setCanGroupBy(Boolean CanGroupBy) {
        this.CanGroupBy = CanGroupBy;
    }

    /**
     * Get Whether it must be used as an aggregate dimension 
     * @return MustGroupBy Whether it must be used as an aggregate dimension
     */
    public Boolean getMustGroupBy() {
        return this.MustGroupBy;
    }

    /**
     * Set Whether it must be used as an aggregate dimension
     * @param MustGroupBy Whether it must be used as an aggregate dimension
     */
    public void setMustGroupBy(Boolean MustGroupBy) {
        this.MustGroupBy = MustGroupBy;
    }

    /**
     * Get The key to be replaced on the frontend
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowValueReplace The key to be replaced on the frontend
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getShowValueReplace() {
        return this.ShowValueReplace;
    }

    /**
     * Set The key to be replaced on the frontend
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowValueReplace The key to be replaced on the frontend
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowValueReplace(String ShowValueReplace) {
        this.ShowValueReplace = ShowValueReplace;
    }

    public DimensionNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionNew(DimensionNew source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Operators != null) {
            this.Operators = new Operator[source.Operators.length];
            for (int i = 0; i < source.Operators.length; i++) {
                this.Operators[i] = new Operator(source.Operators[i]);
            }
        }
        if (source.IsMultiple != null) {
            this.IsMultiple = new Boolean(source.IsMultiple);
        }
        if (source.IsMutable != null) {
            this.IsMutable = new Boolean(source.IsMutable);
        }
        if (source.IsVisible != null) {
            this.IsVisible = new Boolean(source.IsVisible);
        }
        if (source.CanFilterPolicy != null) {
            this.CanFilterPolicy = new Boolean(source.CanFilterPolicy);
        }
        if (source.CanFilterHistory != null) {
            this.CanFilterHistory = new Boolean(source.CanFilterHistory);
        }
        if (source.CanGroupBy != null) {
            this.CanGroupBy = new Boolean(source.CanGroupBy);
        }
        if (source.MustGroupBy != null) {
            this.MustGroupBy = new Boolean(source.MustGroupBy);
        }
        if (source.ShowValueReplace != null) {
            this.ShowValueReplace = new String(source.ShowValueReplace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamArrayObj(map, prefix + "Operators.", this.Operators);
        this.setParamSimple(map, prefix + "IsMultiple", this.IsMultiple);
        this.setParamSimple(map, prefix + "IsMutable", this.IsMutable);
        this.setParamSimple(map, prefix + "IsVisible", this.IsVisible);
        this.setParamSimple(map, prefix + "CanFilterPolicy", this.CanFilterPolicy);
        this.setParamSimple(map, prefix + "CanFilterHistory", this.CanFilterHistory);
        this.setParamSimple(map, prefix + "CanGroupBy", this.CanGroupBy);
        this.setParamSimple(map, prefix + "MustGroupBy", this.MustGroupBy);
        this.setParamSimple(map, prefix + "ShowValueReplace", this.ShowValueReplace);

    }
}

