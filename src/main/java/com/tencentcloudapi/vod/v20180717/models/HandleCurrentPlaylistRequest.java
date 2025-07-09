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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleCurrentPlaylistRequest extends AbstractModel {

    /**
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574) id.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The unique identifier of the playlist.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * Operation type, available options:<li>insert: insert program into the current playlist.</li> <li>inserttemporary: temporarily insert program into the current playlist. can only be inserted after the currently playing program. temporarily inserted programs are only effective during this carousel process.</li><li>delete: delete program from the playlist. cannot delete currently playing programs.</li>.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Playlist program id. required when operation is insert, indicating the program list will be inserted after this program. the insertion position must be after the currently playing program.
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574) id.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574) id.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574) id.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574) id.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The unique identifier of the playlist. 
     * @return RoundPlayId The unique identifier of the playlist.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set The unique identifier of the playlist.
     * @param RoundPlayId The unique identifier of the playlist.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get Operation type, available options:<li>insert: insert program into the current playlist.</li> <li>inserttemporary: temporarily insert program into the current playlist. can only be inserted after the currently playing program. temporarily inserted programs are only effective during this carousel process.</li><li>delete: delete program from the playlist. cannot delete currently playing programs.</li>. 
     * @return Operation Operation type, available options:<li>insert: insert program into the current playlist.</li> <li>inserttemporary: temporarily insert program into the current playlist. can only be inserted after the currently playing program. temporarily inserted programs are only effective during this carousel process.</li><li>delete: delete program from the playlist. cannot delete currently playing programs.</li>.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type, available options:<li>insert: insert program into the current playlist.</li> <li>inserttemporary: temporarily insert program into the current playlist. can only be inserted after the currently playing program. temporarily inserted programs are only effective during this carousel process.</li><li>delete: delete program from the playlist. cannot delete currently playing programs.</li>.
     * @param Operation Operation type, available options:<li>insert: insert program into the current playlist.</li> <li>inserttemporary: temporarily insert program into the current playlist. can only be inserted after the currently playing program. temporarily inserted programs are only effective during this carousel process.</li><li>delete: delete program from the playlist. cannot delete currently playing programs.</li>.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Playlist program id. required when operation is insert, indicating the program list will be inserted after this program. the insertion position must be after the currently playing program. 
     * @return ItemId Playlist program id. required when operation is insert, indicating the program list will be inserted after this program. the insertion position must be after the currently playing program.
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Playlist program id. required when operation is insert, indicating the program list will be inserted after this program. the insertion position must be after the currently playing program.
     * @param ItemId Playlist program id. required when operation is insert, indicating the program list will be inserted after this program. the insertion position must be after the currently playing program.
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10. 
     * @return RoundPlaylist Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
     * @param RoundPlaylist Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    public HandleCurrentPlaylistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleCurrentPlaylistRequest(HandleCurrentPlaylistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);

    }
}

