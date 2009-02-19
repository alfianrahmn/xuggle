/*
 * Copyright (c) 2008-2009 by Xuggle Inc. All rights reserved.
 *
 * It is REQUESTED BUT NOT REQUIRED if you use this library, that you let 
 * us know by sending e-mail to info@xuggle.com telling us briefly how you're
 * using the library and what you like or don't like about it.
 *
 * This library is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation; either version 2.1 of the License, or (at your option) any later
 * version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.xuggle.red5;

import com.xuggle.xuggler.IVideoPicture;

/**
 * A listener for intercepting video pictures decoded, re-sampled,and encoded by the {@link Transcoder}.
 */
public interface IVideoPictureListener
{
  /**
   * Called by the {@link Transcoder} right after it decodes a packet.
   * Callers can return a new object which will be substituted into
   * the {@link Transcoder} work flow instead of the original decoded object.
   * @param aObject The object that was decoded.
   * @return A new object to replace aObject, or aObject to do nothing.
   */
  IVideoPicture postDecode(IVideoPicture aObject);
  
  /**
   * Called by the {@link Transcoder} right before it resamples an object.
   * Callers can return a new object which will be substituted into
   * the {@link Transcoder} work flow instead of the aObject object.
   * @param aObject The object that is about to be resampled.
   * @return A new object to replace aObject, or aObject to do nothing.
   */
  IVideoPicture preResample(IVideoPicture aObject);
  
  
  /**
   * Called by the {@link Transcoder} right after it resamples an object.
   * Callers can return a new object which will be substituted into
   * the {@link Transcoder} work flow instead of the aObject object.
   * @param aObject The object that was just resampled.
   * @return A new object to replace aObject, or aObject to do nothing.
   */
  IVideoPicture postResample(IVideoPicture aObject);
  
  /**
   * Called by the {@link Transcoder} right before it encodes an object.
   * Callers can return a new object which will be substituted into
   * the {@link Transcoder} work flow instead of the aObject object.
   * @param aObject The object that is about to be encoded.
   * @return A new object to replace aObject, or aObject to do nothing.
   */
  IVideoPicture preEncode(IVideoPicture aObject);

}