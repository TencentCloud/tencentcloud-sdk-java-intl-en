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

public class EntityStatus extends AbstractModel {

    /**
    * Instance name. Only subdomain names are supported.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Instance configuration status. Values:
<li>`online`: Configuration has taken effect;</li><li>`fail`: Configuration failed;</li><li>`process`: Configuration is being delivered. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Message returned after the operation completed. 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Instance name. Only subdomain names are supported. 
     * @return Entity Instance name. Only subdomain names are supported.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Instance name. Only subdomain names are supported.
     * @param Entity Instance name. Only subdomain names are supported.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Instance configuration status. Values:
<li>`online`: Configuration has taken effect;</li><li>`fail`: Configuration failed;</li><li>`process`: Configuration is being delivered. </li> 
     * @return Status Instance configuration status. Values:
<li>`online`: Configuration has taken effect;</li><li>`fail`: Configuration failed;</li><li>`process`: Configuration is being delivered. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance configuration status. Values:
<li>`online`: Configuration has taken effect;</li><li>`fail`: Configuration failed;</li><li>`process`: Configuration is being delivered. </li>
     * @param Status Instance configuration status. Values:
<li>`online`: Configuration has taken effect;</li><li>`fail`: Configuration failed;</li><li>`process`: Configuration is being delivered. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Message returned after the operation completed.  
     * @return Message Message returned after the operation completed. 
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Message returned after the operation completed. 
     * @param Message Message returned after the operation completed. 
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public EntityStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityStatus(EntityStatus source) {
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

