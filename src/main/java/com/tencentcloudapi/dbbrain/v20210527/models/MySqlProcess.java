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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MySqlProcess extends AbstractModel{

    /**
    * Thread ID.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Thread operation account name.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Thread operation host address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Thread operation database.
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * Thread operation status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Thread execution type.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Thread operation duration in seconds.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Thread operation statement.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get Thread ID. 
     * @return ID Thread ID.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Thread ID.
     * @param ID Thread ID.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Thread operation account name. 
     * @return User Thread operation account name.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Thread operation account name.
     * @param User Thread operation account name.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Thread operation host address. 
     * @return Host Thread operation host address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Thread operation host address.
     * @param Host Thread operation host address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Thread operation database. 
     * @return DB Thread operation database.
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set Thread operation database.
     * @param DB Thread operation database.
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get Thread operation status. 
     * @return State Thread operation status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Thread operation status.
     * @param State Thread operation status.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Thread execution type. 
     * @return Command Thread execution type.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Thread execution type.
     * @param Command Thread execution type.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Thread operation duration in seconds. 
     * @return Time Thread operation duration in seconds.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Thread operation duration in seconds.
     * @param Time Thread operation duration in seconds.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Thread operation statement. 
     * @return Info Thread operation statement.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Thread operation statement.
     * @param Info Thread operation statement.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    public MySqlProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MySqlProcess(MySqlProcess source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

