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

public class NoticeSendGroup extends AbstractModel {

    /**
    * <p>Send group type</p><p>Enumeration value:</p><ul><li>USER: User</li><li>GROUP: User group</li><li>OnCallForm: Duty schedule</li></ul>
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * <p>Notifier info</p>
    */
    @SerializedName("Users")
    @Expose
    private NoticeUserInfo [] Users;

    /**
     * Get <p>Send group type</p><p>Enumeration value:</p><ul><li>USER: User</li><li>GROUP: User group</li><li>OnCallForm: Duty schedule</li></ul> 
     * @return ReceiverType <p>Send group type</p><p>Enumeration value:</p><ul><li>USER: User</li><li>GROUP: User group</li><li>OnCallForm: Duty schedule</li></ul>
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set <p>Send group type</p><p>Enumeration value:</p><ul><li>USER: User</li><li>GROUP: User group</li><li>OnCallForm: Duty schedule</li></ul>
     * @param ReceiverType <p>Send group type</p><p>Enumeration value:</p><ul><li>USER: User</li><li>GROUP: User group</li><li>OnCallForm: Duty schedule</li></ul>
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get <p>Notifier info</p> 
     * @return Users <p>Notifier info</p>
     */
    public NoticeUserInfo [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>Notifier info</p>
     * @param Users <p>Notifier info</p>
     */
    public void setUsers(NoticeUserInfo [] Users) {
        this.Users = Users;
    }

    public NoticeSendGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeSendGroup(NoticeSendGroup source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.Users != null) {
            this.Users = new NoticeUserInfo[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new NoticeUserInfo(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);

    }
}

