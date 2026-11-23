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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomGroupRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Unique ID of the custom group.</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Custom group name. If this field is not specified, the original value is retained.</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>Specifies how to update GroupItems.</p><p>Valid values:</p><ul><li>Replace: Replaces the entire original entry list with GroupItems.</li><li>Append: Appends GroupItems to the group entry list.</li><li>Remove: Removes entries whose Content and ItemType are the same as those in GroupItems from the original entry list. If a specified entry does not exist, it is ignored.</li></ul><p>Default value: Replace</p>
    */
    @SerializedName("GroupItemOperation")
    @Expose
    private String GroupItemOperation;

    /**
    * <p>List of custom group entries. If this field is not specified, the original value is retained.</p>
    */
    @SerializedName("GroupItems")
    @Expose
    private CustomGroupItem [] GroupItems;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Unique ID of the custom group.</p> 
     * @return GroupId <p>Unique ID of the custom group.</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>Unique ID of the custom group.</p>
     * @param GroupId <p>Unique ID of the custom group.</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Custom group name. If this field is not specified, the original value is retained.</p> 
     * @return GroupName <p>Custom group name. If this field is not specified, the original value is retained.</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>Custom group name. If this field is not specified, the original value is retained.</p>
     * @param GroupName <p>Custom group name. If this field is not specified, the original value is retained.</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>Specifies how to update GroupItems.</p><p>Valid values:</p><ul><li>Replace: Replaces the entire original entry list with GroupItems.</li><li>Append: Appends GroupItems to the group entry list.</li><li>Remove: Removes entries whose Content and ItemType are the same as those in GroupItems from the original entry list. If a specified entry does not exist, it is ignored.</li></ul><p>Default value: Replace</p> 
     * @return GroupItemOperation <p>Specifies how to update GroupItems.</p><p>Valid values:</p><ul><li>Replace: Replaces the entire original entry list with GroupItems.</li><li>Append: Appends GroupItems to the group entry list.</li><li>Remove: Removes entries whose Content and ItemType are the same as those in GroupItems from the original entry list. If a specified entry does not exist, it is ignored.</li></ul><p>Default value: Replace</p>
     */
    public String getGroupItemOperation() {
        return this.GroupItemOperation;
    }

    /**
     * Set <p>Specifies how to update GroupItems.</p><p>Valid values:</p><ul><li>Replace: Replaces the entire original entry list with GroupItems.</li><li>Append: Appends GroupItems to the group entry list.</li><li>Remove: Removes entries whose Content and ItemType are the same as those in GroupItems from the original entry list. If a specified entry does not exist, it is ignored.</li></ul><p>Default value: Replace</p>
     * @param GroupItemOperation <p>Specifies how to update GroupItems.</p><p>Valid values:</p><ul><li>Replace: Replaces the entire original entry list with GroupItems.</li><li>Append: Appends GroupItems to the group entry list.</li><li>Remove: Removes entries whose Content and ItemType are the same as those in GroupItems from the original entry list. If a specified entry does not exist, it is ignored.</li></ul><p>Default value: Replace</p>
     */
    public void setGroupItemOperation(String GroupItemOperation) {
        this.GroupItemOperation = GroupItemOperation;
    }

    /**
     * Get <p>List of custom group entries. If this field is not specified, the original value is retained.</p> 
     * @return GroupItems <p>List of custom group entries. If this field is not specified, the original value is retained.</p>
     */
    public CustomGroupItem [] getGroupItems() {
        return this.GroupItems;
    }

    /**
     * Set <p>List of custom group entries. If this field is not specified, the original value is retained.</p>
     * @param GroupItems <p>List of custom group entries. If this field is not specified, the original value is retained.</p>
     */
    public void setGroupItems(CustomGroupItem [] GroupItems) {
        this.GroupItems = GroupItems;
    }

    public ModifyCustomGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomGroupRequest(ModifyCustomGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupItemOperation != null) {
            this.GroupItemOperation = new String(source.GroupItemOperation);
        }
        if (source.GroupItems != null) {
            this.GroupItems = new CustomGroupItem[source.GroupItems.length];
            for (int i = 0; i < source.GroupItems.length; i++) {
                this.GroupItems[i] = new CustomGroupItem(source.GroupItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupItemOperation", this.GroupItemOperation);
        this.setParamArrayObj(map, prefix + "GroupItems.", this.GroupItems);

    }
}

