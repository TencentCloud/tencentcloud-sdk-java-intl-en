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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityGroupRuleRequest extends AbstractModel {

    /**
    * ID of the rule to delete
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Tencent Cloud region (abbreviation)
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Direction. 0: outbound; 1: inbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Indicates whether to delete the reverse rule. 0: no; 1: yes
    */
    @SerializedName("IsDelReverse")
    @Expose
    private Long IsDelReverse;

    /**
     * Get ID of the rule to delete 
     * @return Id ID of the rule to delete
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID of the rule to delete
     * @param Id ID of the rule to delete
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Tencent Cloud region (abbreviation) 
     * @return Area Tencent Cloud region (abbreviation)
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Tencent Cloud region (abbreviation)
     * @param Area Tencent Cloud region (abbreviation)
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Direction. 0: outbound; 1: inbound 
     * @return Direction Direction. 0: outbound; 1: inbound
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound
     * @param Direction Direction. 0: outbound; 1: inbound
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Indicates whether to delete the reverse rule. 0: no; 1: yes 
     * @return IsDelReverse Indicates whether to delete the reverse rule. 0: no; 1: yes
     */
    public Long getIsDelReverse() {
        return this.IsDelReverse;
    }

    /**
     * Set Indicates whether to delete the reverse rule. 0: no; 1: yes
     * @param IsDelReverse Indicates whether to delete the reverse rule. 0: no; 1: yes
     */
    public void setIsDelReverse(Long IsDelReverse) {
        this.IsDelReverse = IsDelReverse;
    }

    public DeleteSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityGroupRuleRequest(DeleteSecurityGroupRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.IsDelReverse != null) {
            this.IsDelReverse = new Long(source.IsDelReverse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "IsDelReverse", this.IsDelReverse);

    }
}

