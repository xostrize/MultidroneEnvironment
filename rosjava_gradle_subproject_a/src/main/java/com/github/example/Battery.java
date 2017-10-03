/*
 * Copyright (C) 2014 student.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.example;

import ardrone_autonomy.Navdata;
import org.apache.commons.logging.Log;
import org.ros.message.MessageListener;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.NodeMain;
import org.ros.node.topic.Subscriber;

/**
 * A simple {@link Subscriber} {@link NodeMain}.
 */
public class Battery extends AbstractNodeMain {

  @Override
  public GraphName getDefaultNodeName() {
    return GraphName.of("rosjava/listener");
  }

  @Override
  public void onStart(ConnectedNode connectedNode) {
    final Log log = connectedNode.getLog();
    Subscriber<Navdata> subscriber = connectedNode.newSubscriber("/ardrone_1/ardrone/navdata", Navdata._TYPE);
    log.info("Listen on topic /ardrone/navdata");
    subscriber.addMessageListener(new MessageListener<Navdata>() {

        @Override
        public void onNewMessage(Navdata t) {
            log.info("Battery state is \"" + t.getBatteryPercent() + "\"");

        }
    });

  }
}