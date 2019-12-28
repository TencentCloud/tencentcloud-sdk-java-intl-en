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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPolicyResponse extends AbstractModel{

    /**
    * Policy name
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy description
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 1: Custom policy; 2: Preset policy
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Time created
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Time of latest update
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Policy document
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Policy name
Note: This field may return null, indicating that no valid value was found. 
     * @return PolicyName Policy name
Note: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid value was found.
     * @param PolicyName Policy name
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy description
Note: This field may return null, indicating that no valid value was found. 
     * @return Description Policy description
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
Note: This field may return null, indicating that no valid value was found.
     * @param Description Policy description
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 1: Custom policy; 2: Preset policy
Note: This field may return null, indicating that no valid value was found. 
     * @return Type 1: Custom policy; 2: Preset policy
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1: Custom policy; 2: Preset policy
Note: This field may return null, indicating that no valid value was found.
     * @param Type 1: Custom policy; 2: Preset policy
Note: This field may return null, indicating that no valid value was found.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Time created
Note: This field may return null, indicating that no valid value was found. 
     * @return AddTime Time created
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Time created
Note: This field may return null, indicating that no valid value was found.
     * @param AddTime Time created
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Time of latest update
Note: This field may return null, indicating that no valid value was found. 
     * @return UpdateTime Time of latest update
Note: This field may return null, indicating that no valid value was found.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Time of latest update
Note: This field may return null, indicating that no valid value was found.
     * @param UpdateTime Time of latest update
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Policy document
Note: This field may return null, indicating that no valid value was found. 
     * @return PolicyDocument Policy document
Note: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set Policy document
Note: This field may return null, indicating that no valid value was found.
     * @param PolicyDocument Policy document
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

